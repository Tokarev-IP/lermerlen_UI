package test.app.lermerlen

import android.annotation.SuppressLint
import android.app.StatusBarManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jaeger.library.StatusBarUtil

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StatusBarUtil.setLightMode(this)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        val badge = bottomNav.getOrCreateBadge(R.id.action_five)
        badge.isVisible = true
        badge.number = 6

    }
}