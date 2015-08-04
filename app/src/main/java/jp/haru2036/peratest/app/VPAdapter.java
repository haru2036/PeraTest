package jp.haru2036.peratest.app;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 2036 on 2015/08/05.
 */
public class VPAdapter extends FragmentPagerAdapter{
    public VPAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return new PageFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
