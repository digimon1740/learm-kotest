import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe

internal class FlowTest : FreeSpec() {

    override suspend fun beforeSpec(spec: Spec) {
        println("beforeSpec!!")
    }

    override fun beforeTest(f: suspend (TestCase) -> Unit) {
        println("beforeSpec!!")
    }

    override suspend fun beforeContainer(testCase: TestCase) {
        println("beforeContainer!!")
    }

    override suspend fun beforeEach(testCase: TestCase) {
        println("beforeEach!!")
    }

    override suspend fun beforeAny(testCase: TestCase) {
        println("beforeAny!!")
    }


    init {
        "컨테이너 11" - {
            "테스트1" {
                println("테스트1")
                val str = "테스트 1111"

                str.length shouldBe 8

            }
            "테스트2" {
                println("테스트2")
                val a = 1234

                a shouldBe 1234
            }
        }
    }
}