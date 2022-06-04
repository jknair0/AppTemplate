package tech.jknair.##projectname##.ui.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import tech.jknair.##projectname##.ui.theme.##ProjectName##Theme

abstract class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ##ProjectName##Theme {
                Content()
            }
        }
    }

    @Composable
    abstract fun Content()

}