package io.intercom.android.sdk.utilities;

import android.app.Activity;
import android.os.Bundle;
import com.intercom.composer.ComposerFragment;
import com.intercom.input.gallery.GalleryInput;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.activities.IntercomHelpCenterActivity;
/* loaded from: classes3.dex */
public class ActivityUtils {
    private static final String COMPOSER_INPUT_PACKAGE_NAME;
    private static final String[] INTERCOM_PACKAGES;
    private static final String PACKAGE_NAME = Intercom.class.getPackage().getName();
    private static final String COMPOSER_PACKAGE_NAME = ComposerFragment.class.getPackage().getName();

    static {
        String name = GalleryInput.class.getPackage().getName();
        COMPOSER_INPUT_PACKAGE_NAME = name;
        INTERCOM_PACKAGES = new String[]{PACKAGE_NAME, COMPOSER_PACKAGE_NAME, name};
    }

    public static boolean isFullScreenHelpCenter(Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return false;
        }
        Bundle extras = activity.getIntent().getExtras();
        return (activity instanceof IntercomHelpCenterActivity) && (extras != null ? extras.getInt(IntercomHelpCenterActivity.PARCEL_DISPLAY_MODE, 1) : 1) == 1;
    }

    public static boolean isHostActivity(Activity activity) {
        return activity != null && isInHostAppPackage(activity.getClass().getName());
    }

    private static boolean isInHostAppPackage(String str) {
        for (String str2 : INTERCOM_PACKAGES) {
            if (str.startsWith(str2)) {
                return false;
            }
        }
        return true;
    }
}
