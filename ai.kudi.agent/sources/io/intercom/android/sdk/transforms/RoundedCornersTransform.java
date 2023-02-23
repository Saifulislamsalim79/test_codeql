package io.intercom.android.sdk.transforms;

import android.graphics.Bitmap;
import io.intercom.android.sdk.commons.utilities.BitmapUtils;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e;
import java.security.MessageDigest;
/* loaded from: classes3.dex */
public class RoundedCornersTransform extends AbstractC10742e {
    private static final int VERSION = 1;

    /* renamed from: id */
    private final String f23917id;
    private final byte[] idBytes;
    private final int radius;

    public RoundedCornersTransform(int i) {
        this.radius = i;
        String str = "io.intercom.android.sdk.transforms.RoundedCornersTransform.(radius=" + i + ")1";
        this.f23917id = str;
        this.idBytes = str.getBytes(InterfaceC10622g.f24418a);
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e
    protected Bitmap transform(final InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        return BitmapUtils.transformRoundCorners(bitmap, new BitmapUtils.BitmapCache() { // from class: io.intercom.android.sdk.transforms.RoundedCornersTransform.1
            public Bitmap get(int i3, int i4, Bitmap.Config config) {
                return interfaceC10581e.get(i3, i4, config);
            }
        }, this.radius);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.idBytes);
    }
}
