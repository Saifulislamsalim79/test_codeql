package com.intercom.input.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.e;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.FragmentManager;
import com.intercom.composer.WindowUtil;
/* loaded from: classes2.dex */
public class GalleryLightBoxActivity extends e {
    private static final String KEY_FRAGMENT_CLASS = "fragment_class";
    private Class<? extends GalleryLightBoxFragment> fragmentClass;
    FragmentManager fragmentManager;
    GalleryImage galleryImage;

    public static Intent createIntent(Context context, GalleryImage galleryImage, Class<? extends GalleryLightBoxFragment> cls) {
        return new Intent(context, GalleryLightBoxActivity.class).putExtra(GalleryInputFullScreenActivity.GALLERY_IMAGE, galleryImage).putExtra(KEY_FRAGMENT_CLASS, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        overridePendingTransition(C7177R.anim.intercom_composer_stay, C7177R.anim.intercom_composer_slide_down);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        Window window = getWindow();
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        setContentView(C7177R.C7180layout.intercom_composer_activity_gallery_lightbox);
        WindowUtil.setFullscreenWindow(window, C7177R.color.intercom_composer_status_bar);
        Intent intent = getIntent();
        this.galleryImage = (GalleryImage) intent.getParcelableExtra(GalleryInputFullScreenActivity.GALLERY_IMAGE);
        this.fragmentClass = ClassUtils.cast(intent.getSerializableExtra(KEY_FRAGMENT_CLASS));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.fragmentManager = supportFragmentManager;
        if (supportFragmentManager.m35941f0(C7177R.C7179id.fragment_container) == null) {
            GalleryLightBoxFragment galleryLightBoxFragment = (GalleryLightBoxFragment) ClassUtils.instantiate(this.fragmentClass);
            galleryLightBoxFragment.setArguments(GalleryLightBoxFragment.createArgs(this.galleryImage));
            AbstractC1449b0 m35924l = this.fragmentManager.m35924l();
            m35924l.m35821r(C7177R.C7179id.fragment_container, galleryLightBoxFragment);
            m35924l.mo35805i();
        }
    }
}
