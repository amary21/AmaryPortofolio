import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.amary.portofolio.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("AmaryPortofolio") {
        App()
    }
}
