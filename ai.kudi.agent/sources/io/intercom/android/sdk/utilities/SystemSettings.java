package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes3.dex */
public class SystemSettings {
    private static final Twig twig = LumberMill.getLogger();

    public static float getTransitionScale(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                return Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
            } catch (Exception e) {
                Twig twig2 = twig;
                twig2.internal("Couldn't get animation scale: " + e.getMessage());
            }
        }
        return 1.0f;
    }
}
