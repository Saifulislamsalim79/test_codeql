package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes3.dex */
public class IntentUtils {
    private static final Twig twig = LumberMill.getLogger();

    public static void safelyOpenIntent(Context context, Intent intent) {
        if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
            twig.m13065i("This device has no application that can handle the Uri passed in", new Object[0]);
        } else {
            context.startActivity(intent);
        }
    }
}
