package com.intercom.input.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.e;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.FragmentManager;
import com.intercom.composer.WindowUtil;
/* loaded from: classes2.dex */
public class GalleryInputFullScreenActivity extends e implements GalleryOutputListener {
    public static final String GALLERY_IMAGE = "gallery_image";
    private static final String KEY_FRAGMENT_ARGS = "fragment_args";
    private static final String KEY_FRAGMENT_CLASS = "fragment_class";
    private Bundle fragmentArgs;
    private Class<? extends GalleryInputFragment> fragmentClass;

    public static Intent createIntent(Context context, Class<? extends GalleryInputFragment> cls, Bundle bundle) {
        return new Intent(context, GalleryInputFullScreenActivity.class).putExtra(KEY_FRAGMENT_CLASS, cls).putExtra(KEY_FRAGMENT_ARGS, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        overridePendingTransition(C7177R.anim.intercom_composer_stay, C7177R.anim.intercom_composer_slide_down);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        setContentView(C7177R.C7180layout.intercom_composer_activity_input_full_screen);
        WindowUtil.setFullscreenWindow(getWindow(), C7177R.color.intercom_composer_status_bar);
        Intent intent = getIntent();
        this.fragmentClass = ClassUtils.cast(intent.getSerializableExtra(KEY_FRAGMENT_CLASS));
        this.fragmentArgs = intent.getBundleExtra(KEY_FRAGMENT_ARGS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.intercom.input.gallery.GalleryOutputListener
    public void onGalleryOutputReceived(GalleryImage galleryImage) {
        Intent intent = new Intent();
        intent.putExtra(GALLERY_IMAGE, galleryImage);
        setResult(-1, intent);
        onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String name = GalleryInputFragment.class.getName();
        if (supportFragmentManager.m35938g0(name) == null) {
            GalleryInputFragment galleryInputFragment = (GalleryInputFragment) ClassUtils.instantiate(this.fragmentClass);
            Bundle bundle2 = this.fragmentArgs == null ? new Bundle() : new Bundle(this.fragmentArgs);
            bundle2.putAll(GalleryInputFragment.createArguments(true));
            galleryInputFragment.setArguments(bundle2);
            galleryInputFragment.setGalleryListener(this);
            AbstractC1449b0 m35924l = supportFragmentManager.m35924l();
            m35924l.m35820s(C7177R.C7179id.expanded_fragment, galleryInputFragment, name);
            m35924l.mo35805i();
        }
    }
}
