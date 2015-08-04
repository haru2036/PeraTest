package jp.haru2036.peratest.app

import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.support.v4.app.FragmentActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.*
import android.widget.TextView
import jp.haru2036.peratest.app.transformers.DepthPageTransformer
import jp.haru2036.peratest.app.R


public class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById(R.id.viewpager) as ViewPager
        val fm = getSupportFragmentManager()
        viewPager.setAdapter(VPAdapter(fm))
        viewPager.setPageTransformer(false, DepthPageTransformer())
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item!!.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}
