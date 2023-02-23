package androidx.core.graphics.drawable;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f4217k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f4218a;

    /* renamed from: b */
    Object f4219b;

    /* renamed from: c */
    public byte[] f4220c;

    /* renamed from: d */
    public Parcelable f4221d;

    /* renamed from: e */
    public int f4222e;

    /* renamed from: f */
    public int f4223f;

    /* renamed from: g */
    public ColorStateList f4224g;

    /* renamed from: h */
    PorterDuff.Mode f4225h;

    /* renamed from: i */
    public String f4226i;

    /* renamed from: j */
    public String f4227j;

    public IconCompat() {
        this.f4218a = -1;
        this.f4220c = null;
        this.f4221d = null;
        this.f4222e = 0;
        this.f4223f = 0;
        this.f4224g = null;
        this.f4225h = f4217k;
        this.f4226i = null;
    }

    /* renamed from: a */
    static Bitmap m36219a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m36218b(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f4219b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    /* renamed from: c */
    public static IconCompat m36217c(Resources resources, String str, int i) {
        if (str != null) {
            if (i != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f4222e = i;
                if (resources != null) {
                    try {
                        iconCompat.f4219b = resources.getResourceName(i);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f4219b = str;
                }
                iconCompat.f4227j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    /* renamed from: f */
    private static int m36214f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: h */
    private static String m36212h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: j */
    private static int m36210j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    /* renamed from: l */
    private static Uri m36208l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: r */
    private static String m36202r(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return IssueTypeFragmentNew.DATA;
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public Bitmap m36216d() {
        if (this.f4218a == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f4219b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        int i = this.f4218a;
        if (i == 1) {
            return (Bitmap) this.f4219b;
        }
        if (i == 5) {
            return m36219a((Bitmap) this.f4219b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: e */
    public int m36215e() {
        if (this.f4218a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m36214f((Icon) this.f4219b);
        }
        if (this.f4218a == 2) {
            return this.f4222e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: g */
    public String m36213g() {
        if (this.f4218a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m36212h((Icon) this.f4219b);
        }
        if (this.f4218a == 2) {
            if (TextUtils.isEmpty(this.f4227j)) {
                return ((String) this.f4219b).split(":", -1)[0];
            }
            return this.f4227j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: i */
    public int m36211i() {
        if (this.f4218a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m36210j((Icon) this.f4219b);
        }
        return this.f4218a;
    }

    /* renamed from: k */
    public Uri m36209k() {
        if (this.f4218a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m36208l((Icon) this.f4219b);
        }
        int i = this.f4218a;
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f4219b);
    }

    /* renamed from: m */
    public InputStream m36207m(Context context) {
        Uri m36209k = m36209k();
        String scheme = m36209k.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f4219b));
            } catch (FileNotFoundException e) {
                Log.w("IconCompat", "Unable to load image from path: " + m36209k, e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m36209k);
        } catch (Exception e2) {
            Log.w("IconCompat", "Unable to load image from URI: " + m36209k, e2);
            return null;
        }
    }

    /* renamed from: n */
    public void m36206n() {
        this.f4225h = PorterDuff.Mode.valueOf(this.f4226i);
        switch (this.f4218a) {
            case -1:
                Parcelable parcelable = this.f4221d;
                if (parcelable != null) {
                    this.f4219b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f4221d;
                if (parcelable2 != null) {
                    this.f4219b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4220c;
                this.f4219b = bArr;
                this.f4218a = 3;
                this.f4222e = 0;
                this.f4223f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4220c, Charset.forName("UTF-16"));
                this.f4219b = str;
                if (this.f4218a == 2 && this.f4227j == null) {
                    this.f4227j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4219b = this.f4220c;
                return;
        }
    }

    /* renamed from: o */
    public void m36205o(boolean z) {
        this.f4226i = this.f4225h.name();
        switch (this.f4218a) {
            case -1:
                if (!z) {
                    this.f4221d = (Parcelable) this.f4219b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f4219b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f4220c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f4221d = (Parcelable) this.f4219b;
                return;
            case 2:
                this.f4220c = ((String) this.f4219b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4220c = (byte[]) this.f4219b;
                return;
            case 4:
            case 6:
                this.f4220c = this.f4219b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    /* renamed from: p */
    public Icon m36204p() {
        return m36203q(null);
    }

    /* renamed from: q */
    public Icon m36203q(Context context) {
        Icon createWithBitmap;
        switch (this.f4218a) {
            case -1:
                return (Icon) this.f4219b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f4219b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(m36213g(), this.f4222e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f4219b, this.f4222e, this.f4223f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f4219b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f4219b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(m36219a((Bitmap) this.f4219b, false));
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(m36209k());
                    break;
                } else if (context != null) {
                    InputStream m36207m = m36207m(context);
                    if (m36207m != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(m36207m));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(m36219a(BitmapFactory.decodeStream(m36207m), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m36209k());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m36209k());
                }
        }
        ColorStateList colorStateList = this.f4224g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f4225h;
        if (mode != f4217k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        if (this.f4218a == -1) {
            return String.valueOf(this.f4219b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m36202r(this.f4218a));
        switch (this.f4218a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4219b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4219b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4227j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m36215e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4222e);
                if (this.f4223f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4223f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4219b);
                break;
        }
        if (this.f4224g != null) {
            sb.append(" tint=");
            sb.append(this.f4224g);
        }
        if (this.f4225h != f4217k) {
            sb.append(" mode=");
            sb.append(this.f4225h);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i) {
        this.f4218a = -1;
        this.f4220c = null;
        this.f4221d = null;
        this.f4222e = 0;
        this.f4223f = 0;
        this.f4224g = null;
        this.f4225h = f4217k;
        this.f4226i = null;
        this.f4218a = i;
    }
}
