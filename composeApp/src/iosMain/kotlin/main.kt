import androidx.compose.ui.window.ComposeUIViewController
import com.amary.portofolio.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
