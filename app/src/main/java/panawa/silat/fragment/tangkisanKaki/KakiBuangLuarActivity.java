package panawa.silat.fragment.tangkisanKaki;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import panawa.silat.BelajarBelaanActivity;
import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class KakiBuangLuarActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sikapView = inflater.inflate(R.layout.activity_kaki_buang_luar, container, false);


        return sikapView;
    }
}
