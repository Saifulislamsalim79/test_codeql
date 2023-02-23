package io.intercom.android.sdk.transforms;

import android.graphics.Bitmap;
import io.intercom.android.sdk.commons.utilities.BitmapUtils;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e;
import java.security.MessageDigest;
/* loaded from: classes3.dex */
public class RoundTransform extends AbstractC10742e {

    /* renamed from: ID */
    private static final String f23916ID = "io.intercom.android.sdk.transforms.RoundTransform.1";
    private static final byte[] ID_BYTES = f23916ID.getBytes(InterfaceC10622g.f24418a);
    private static final int VERSION = 1;

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        return obj instanceof RoundTransform;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return -1438512332;
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e
    protected Bitmap transform(final InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        return BitmapUtils.transformRound(bitmap, new BitmapUtils.BitmapCache() { // from class: io.intercom.android.sdk.transforms.RoundTransform.1
            public Bitmap get(int i3, int i4, Bitmap.Config config) {
                return interfaceC10581e.get(i3, i4, config);
            }
        });
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
