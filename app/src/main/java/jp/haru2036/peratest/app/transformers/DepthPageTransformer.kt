package jp.haru2036.peratest.app.transformers

import android.support.v4.view.ViewPager
import android.view.View

/**
 * Created by haru2036 on 2015/08/04.
 */
public class DepthPageTransformer : ViewPager.PageTransformer {

    override fun transformPage(view: View, position: Float) {
        val pageWidth = view.getWidth()

        if (position < -1) {
            // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.bringToFront()
            view.setAlpha(0f)

        } else if (position <= 0) {
            // [-1,0]
            // Use the default slide transition when moving to the left page
            view.setAlpha(1f)
            view.setTranslationX(0f)
            view.setScaleX(1f)
            view.setScaleY(1f)
            view.bringToFront()

        } else if (position <= 1) {
            // (0,1]
            // Fade the page out.
            view.setAlpha(1 - position)

            // Counteract the default slide transition
            view.setTranslationX((pageWidth * -position) * 0.3f)
            view.setScaleX(1f)
            view.setScaleY(1f)


        } else {
            // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(0f)
        }
    }
}
