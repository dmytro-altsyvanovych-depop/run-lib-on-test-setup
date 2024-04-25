import io.github.embeddedkafka.EmbeddedKafka
import org.specs2.mutable.Specification

class TestKafkaConnection extends Specification with EmbeddedKafka {
  sequential

  "publish / consume" should {
    "be possible without start / stop in tests" in {
      publishStringMessageToKafka("test.topic.fact", "message")
      consumeFirstStringMessageFrom("test.topic.fact") must beEqualTo("message")
    }

    "run this second test" in {
      publishStringMessageToKafka("test.second.topic.fact", "test")
      consumeFirstStringMessageFrom("test.second.topic.fact") must beEqualTo("test")
    }
  }
}
