package com.tencent.supercqzhou.android_p_method_test;

import android.app.Activity;
import android.content.res.AssetManager;
import android.database.CursorWindow;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Method;

public class MainActivity extends Activity implements View.OnClickListener{
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(Button)findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if (id==R.id.button){
            test4();
        }
    }

    public void test(){
        try {
            Class<?> clazz = Class.forName("android.os.SystemProperties");
            Method mthGet = clazz.getDeclaredMethod("get", String.class);
            String value = (String) mthGet.invoke(null, "ro.product.manufacturer");
            Log.d("SystemProperties","SystemProperties.get(ro.product.manufacturer)="+value+" \n"+ Log.getStackTraceString(new Throwable()) );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void test2(){
        try {
            AssetManager am = AssetManager.class.newInstance();
            Method assetMag_addAssetPathMtd = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            assetMag_addAssetPathMtd.setAccessible(true);
//            result = (int) assetMag_addAssetPathMtd.invoke(am, path);
//            Log.d("SystemProperties","SystemProperties.get(ro.product.manufacturer)="+value+" \n"+ Log.getStackTraceString(new Throwable()) );
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void test3(){
        try {
            AdaptiveIconDrawable am = new AdaptiveIconDrawable(new Drawable() {
                @Override
                public void draw(Canvas canvas) {

                }

                @Override
                public void setAlpha(int i) {

                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {

                }

                @Override
                public int getOpacity() {
                    return 0;
                }
            }, new Drawable() {
                @Override
                public void draw(Canvas canvas) {

                }

                @Override
                public void setAlpha(int i) {

                }

                @Override
                public void setColorFilter( ColorFilter colorFilter) {

                }

                @Override
                public int getOpacity() {
                    return 0;
                }
            });
            Method assetMag_addAssetPathMtd = AdaptiveIconDrawable.class.getDeclaredMethod("clearMutated");
            assetMag_addAssetPathMtd.setAccessible(true);
//            result = (int) assetMag_addAssetPathMtd.invoke(am, path);
//            Log.d("SystemProperties","SystemProperties.get(ro.product.manufacturer)="+value+" \n"+ Log.getStackTraceString(new Throwable()) );
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void test4(){
        try{
            CursorWindow cursorWindow=new CursorWindow("aa");
            Method assetMag_addAssetPathMtd = CursorWindow.class.getDeclaredMethod("getCursorWindowSize");
            assetMag_addAssetPathMtd.setAccessible(true);
            int size=(int)assetMag_addAssetPathMtd.invoke(cursorWindow);
            Log.d("CursorWindow","size="+size);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void testBlack(){
        try{
            Class gg=Class.forName("android/providers/settings/GlobalSettingsProto");
            gg.newInstance();
//            Method assetMag_addAssetPathMtd = gg.class.getDeclaredMethod("getCursorWindowSize");
//            assetMag_addAssetPathMtd.setAccessible(true);
//            int size=(int)assetMag_addAssetPathMtd.invoke(cursorWindow);
//            Log.d("CursorWindow","size="+size);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
