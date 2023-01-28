import android.view.View
import android.widget.FrameLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import me.ibrahimsn.lib.SmoothBottomBar

class ScrollHandler : CoordinatorLayout.Behavior<SmoothBottomBar>() {

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: SmoothBottomBar,
        dependency: View
    ): Boolean {
        return dependency is FrameLayout
    }

    override fun onStartNestedScroll(
        coordinatorLayout: CoordinatorLayout, child: SmoothBottomBar,
        directTargetChild: View, target: View, nestedScrollAxes: Int
    ): Boolean {
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL
    }

    override fun onNestedPreScroll(
        coordinatorLayout: CoordinatorLayout, child: SmoothBottomBar,
        target: View, dx: Int, dy: Int, consumed: IntArray
    ) {
        if (dy < 0) {
            showBottomNavigationView(child)
        } else if (dy > 0) {
            hideBottomNavigationView(child)
        }
    }

    private fun hideBottomNavigationView(view: SmoothBottomBar) {
        view.animate().translationY(view.height.toFloat())
    }

    private fun showBottomNavigationView(view:SmoothBottomBar) {
        view.animate().translationY(0f)
    }
}