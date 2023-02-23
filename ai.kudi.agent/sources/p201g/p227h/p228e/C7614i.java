package p201g.p227h.p228e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.p057e.C1347c;
import java.io.IOException;
import java.io.InputStream;
import p201g.p227h.p234i.C7642f;
/* compiled from: TypefaceCompatApi29Impl.java */
/* renamed from: g.h.e.i */
/* loaded from: classes2.dex */
public class C7614i extends C7615j {
    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: b */
    public Typeface mo18013b(Context context, C1347c.C1349b c1349b, Resources resources, int i) {
        try {
            C1347c.C1350c[] m36267a = c1349b.m36267a();
            int length = m36267a.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                C1347c.C1350c c1350c = m36267a[i2];
                try {
                    Font.Builder weight = new Font.Builder(resources, c1350c.m36265b()).setWeight(c1350c.m36262e());
                    if (!c1350c.m36261f()) {
                        i3 = 0;
                    }
                    Font build = weight.setSlant(i3).setTtcIndex(c1350c.m36264c()).setFontVariationSettings(c1350c.m36263d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: c */
    public Typeface mo18012c(Context context, CancellationSignal cancellationSignal, C7642f.C7644b[] c7644bArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c7644bArr.length;
            FontFamily.Builder builder = null;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
                }
                C7642f.C7644b c7644b = c7644bArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c7644b.m17935d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c7644b.m17934e());
                        if (!c7644b.m17933f()) {
                            i3 = 0;
                        }
                        Font build = weight.setSlant(i3).setTtcIndex(c7644b.m17936c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                        }
                    } catch (Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: d */
    public Typeface mo18011d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: e */
    public Typeface mo18010e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: h */
    public C7642f.C7644b mo18007h(C7642f.C7644b[] c7644bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
