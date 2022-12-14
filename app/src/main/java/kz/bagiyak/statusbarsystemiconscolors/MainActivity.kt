package kz.bagiyak.statusbarsystemiconscolors

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            this.window.apply {
                val isAppearanceLightStatusBar = WindowCompat.getInsetsController(this, this.decorView).isAppearanceLightStatusBars
                if (isAppearanceLightStatusBar) {
                    statusBarColor = android.graphics.Color.BLACK	// dark theme background
                    // set system icons to White color
                    WindowCompat.getInsetsController(this, this.decorView).isAppearanceLightStatusBars = false
                    //old variant: ViewCompat.getWindowInsetsController(this.decorView)?.isAppearanceLightStatusBars = false
                } else {
                    statusBarColor = android.graphics.Color.WHITE	// light theme background
                    // set system icons to Gray color
                    WindowCompat.getInsetsController(this, this.decorView).isAppearanceLightStatusBars = true
                    //old variant: ViewCompat.getWindowInsetsController(this.decorView)?.isAppearanceLightStatusBars = true
                }
            }
        }

    }
}