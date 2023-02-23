package io.intercom.android.sdk.push;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.NameUtils;
/* loaded from: classes3.dex */
class PushAvatarUtils {
    private static final int LARGE_ICON_SIZE_DP = 48;

    PushAvatarUtils() {
    }

    private static Bitmap drawableToBitmap(Context context, Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            int dpToPx = ScreenUtils.dpToPx(48.0f, context);
            createBitmap = Bitmap.createBitmap(dpToPx, dpToPx, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap getNotificationDefaultBitmap(Context context, AppConfig appConfig) {
        return drawableToBitmap(context, AvatarUtils.getDefaultDrawable(context, appConfig));
    }

    public static Bitmap getNotificationInitialsBitmap(Context context, String str, AppConfig appConfig) {
        return drawableToBitmap(context, AvatarUtils.getInitialsDrawable(NameUtils.getInitial(str), appConfig));
    }
}
