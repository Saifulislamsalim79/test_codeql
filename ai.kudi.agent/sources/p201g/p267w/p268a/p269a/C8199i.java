package p201g.p267w.p268a.p269a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.p057e.C1346b;
import androidx.core.content.p057e.C1355f;
import androidx.core.content.p057e.C1364g;
import androidx.core.graphics.drawable.C1365a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p218e.C7521a;
import p201g.p227h.p228e.C7605c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: VectorDrawableCompat.java */
/* renamed from: g.w.a.a.i */
/* loaded from: classes2.dex */
public class C8199i extends AbstractC8198h {

    /* renamed from: B */
    static final PorterDuff.Mode f19675B = PorterDuff.Mode.SRC_IN;

    /* renamed from: A */
    private final Rect f19676A;

    /* renamed from: d */
    private C8207h f19677d;

    /* renamed from: e */
    private PorterDuffColorFilter f19678e;

    /* renamed from: f */
    private ColorFilter f19679f;

    /* renamed from: w */
    private boolean f19680w;

    /* renamed from: x */
    private boolean f19681x;

    /* renamed from: y */
    private final float[] f19682y;

    /* renamed from: z */
    private final Matrix f19683z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$b */
    /* loaded from: classes2.dex */
    public static class C8201b extends AbstractC8205f {
        C8201b() {
        }

        /* renamed from: f */
        private void m16510f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f19710b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f19709a = C7605c.m18057d(string2);
            }
            this.f19711c = C1364g.m36225g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p201g.p267w.p268a.p269a.C8199i.AbstractC8205f
        /* renamed from: c */
        public boolean mo16500c() {
            return true;
        }

        /* renamed from: e */
        public void m16511e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C1364g.m36222j(xmlPullParser, "pathData")) {
                TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19650d);
                m16510f(m36221k, xmlPullParser);
                m36221k.recycle();
            }
        }

        C8201b(C8201b c8201b) {
            super(c8201b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8204e {
        private AbstractC8204e() {
        }

        /* renamed from: a */
        public boolean mo16502a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo16501b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$h */
    /* loaded from: classes2.dex */
    public static class C8207h extends Drawable.ConstantState {

        /* renamed from: a */
        int f19730a;

        /* renamed from: b */
        C8206g f19731b;

        /* renamed from: c */
        ColorStateList f19732c;

        /* renamed from: d */
        PorterDuff.Mode f19733d;

        /* renamed from: e */
        boolean f19734e;

        /* renamed from: f */
        Bitmap f19735f;

        /* renamed from: g */
        ColorStateList f19736g;

        /* renamed from: h */
        PorterDuff.Mode f19737h;

        /* renamed from: i */
        int f19738i;

        /* renamed from: j */
        boolean f19739j;

        /* renamed from: k */
        boolean f19740k;

        /* renamed from: l */
        Paint f19741l;

        public C8207h(C8207h c8207h) {
            this.f19732c = null;
            this.f19733d = C8199i.f19675B;
            if (c8207h != null) {
                this.f19730a = c8207h.f19730a;
                C8206g c8206g = new C8206g(c8207h.f19731b);
                this.f19731b = c8206g;
                if (c8207h.f19731b.f19718e != null) {
                    c8206g.f19718e = new Paint(c8207h.f19731b.f19718e);
                }
                if (c8207h.f19731b.f19717d != null) {
                    this.f19731b.f19717d = new Paint(c8207h.f19731b.f19717d);
                }
                this.f19732c = c8207h.f19732c;
                this.f19733d = c8207h.f19733d;
                this.f19734e = c8207h.f19734e;
            }
        }

        /* renamed from: a */
        public boolean m16491a(int i, int i2) {
            return i == this.f19735f.getWidth() && i2 == this.f19735f.getHeight();
        }

        /* renamed from: b */
        public boolean m16490b() {
            return !this.f19740k && this.f19736g == this.f19732c && this.f19737h == this.f19733d && this.f19739j == this.f19734e && this.f19738i == this.f19731b.getRootAlpha();
        }

        /* renamed from: c */
        public void m16489c(int i, int i2) {
            if (this.f19735f == null || !m16491a(i, i2)) {
                this.f19735f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f19740k = true;
            }
        }

        /* renamed from: d */
        public void m16488d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f19735f, (Rect) null, rect, m16487e(colorFilter));
        }

        /* renamed from: e */
        public Paint m16487e(ColorFilter colorFilter) {
            if (m16486f() || colorFilter != null) {
                if (this.f19741l == null) {
                    Paint paint = new Paint();
                    this.f19741l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f19741l.setAlpha(this.f19731b.getRootAlpha());
                this.f19741l.setColorFilter(colorFilter);
                return this.f19741l;
            }
            return null;
        }

        /* renamed from: f */
        public boolean m16486f() {
            return this.f19731b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m16485g() {
            return this.f19731b.m16493f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19730a;
        }

        /* renamed from: h */
        public boolean m16484h(int[] iArr) {
            boolean m16492g = this.f19731b.m16492g(iArr);
            this.f19740k |= m16492g;
            return m16492g;
        }

        /* renamed from: i */
        public void m16483i() {
            this.f19736g = this.f19732c;
            this.f19737h = this.f19733d;
            this.f19738i = this.f19731b.getRootAlpha();
            this.f19739j = this.f19734e;
            this.f19740k = false;
        }

        /* renamed from: j */
        public void m16482j(int i, int i2) {
            this.f19735f.eraseColor(0);
            this.f19731b.m16497b(new Canvas(this.f19735f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C8199i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C8199i(this);
        }

        public C8207h() {
            this.f19732c = null;
            this.f19733d = C8199i.f19675B;
            this.f19731b = new C8206g();
        }
    }

    C8199i() {
        this.f19681x = true;
        this.f19682y = new float[9];
        this.f19683z = new Matrix();
        this.f19676A = new Rect();
        this.f19677d = new C8207h();
    }

    /* renamed from: a */
    static int m16521a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C8199i m16520b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C8199i c8199i = new C8199i();
            c8199i.f19674c = C1355f.m36246d(resources, i, theme);
            new C8208i(c8199i.f19674c.getConstantState());
            return c8199i;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m16519c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static C8199i m16519c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C8199i c8199i = new C8199i();
        c8199i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c8199i;
    }

    /* renamed from: e */
    private void m16517e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C8207h c8207h = this.f19677d;
        C8206g c8206g = c8207h.f19731b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c8206g.f19721h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C8203d c8203d = (C8203d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C8202c c8202c = new C8202c();
                    c8202c.m16507g(resources, attributeSet, theme, xmlPullParser);
                    c8203d.f19697b.add(c8202c);
                    if (c8202c.getPathName() != null) {
                        c8206g.f19729p.put(c8202c.getPathName(), c8202c);
                    }
                    z = false;
                    c8207h.f19730a = c8202c.f19712d | c8207h.f19730a;
                } else if ("clip-path".equals(name)) {
                    C8201b c8201b = new C8201b();
                    c8201b.m16511e(resources, attributeSet, theme, xmlPullParser);
                    c8203d.f19697b.add(c8201b);
                    if (c8201b.getPathName() != null) {
                        c8206g.f19729p.put(c8201b.getPathName(), c8201b);
                    }
                    c8207h.f19730a = c8201b.f19712d | c8207h.f19730a;
                } else if ("group".equals(name)) {
                    C8203d c8203d2 = new C8203d();
                    c8203d2.m16505c(resources, attributeSet, theme, xmlPullParser);
                    c8203d.f19697b.add(c8203d2);
                    arrayDeque.push(c8203d2);
                    if (c8203d2.getGroupName() != null) {
                        c8206g.f19729p.put(c8203d2.getGroupName(), c8203d2);
                    }
                    c8207h.f19730a = c8203d2.f19706k | c8207h.f19730a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m16516f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C1365a.m36196f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m16515g(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: i */
    private void m16513i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C8207h c8207h = this.f19677d;
        C8206g c8206g = c8207h.f19731b;
        c8207h.f19733d = m16515g(C1364g.m36225g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m36229c = C1364g.m36229c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m36229c != null) {
            c8207h.f19732c = m36229c;
        }
        c8207h.f19734e = C1364g.m36231a(typedArray, xmlPullParser, "autoMirrored", 5, c8207h.f19734e);
        c8206g.f19724k = C1364g.m36226f(typedArray, xmlPullParser, "viewportWidth", 7, c8206g.f19724k);
        float m36226f = C1364g.m36226f(typedArray, xmlPullParser, "viewportHeight", 8, c8206g.f19725l);
        c8206g.f19725l = m36226f;
        if (c8206g.f19724k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (m36226f > 0.0f) {
            c8206g.f19722i = typedArray.getDimension(3, c8206g.f19722i);
            float dimension = typedArray.getDimension(2, c8206g.f19723j);
            c8206g.f19723j = dimension;
            if (c8206g.f19722i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                c8206g.setAlpha(C1364g.m36226f(typedArray, xmlPullParser, "alpha", 4, c8206g.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c8206g.f19727n = string;
                    c8206g.f19729p.put(string, c8206g);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36200b(drawable);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m16518d(String str) {
        return this.f19677d.f19731b.f19729p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f19676A);
        if (this.f19676A.width() <= 0 || this.f19676A.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f19679f;
        if (colorFilter == null) {
            colorFilter = this.f19678e;
        }
        canvas.getMatrix(this.f19683z);
        this.f19683z.getValues(this.f19682y);
        float abs = Math.abs(this.f19682y[0]);
        float abs2 = Math.abs(this.f19682y[4]);
        float abs3 = Math.abs(this.f19682y[1]);
        float abs4 = Math.abs(this.f19682y[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min((int) IjkMediaMeta.FF_PROFILE_H264_INTRA, (int) (this.f19676A.width() * abs));
        int min2 = Math.min((int) IjkMediaMeta.FF_PROFILE_H264_INTRA, (int) (this.f19676A.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f19676A;
        canvas.translate(rect.left, rect.top);
        if (m16516f()) {
            canvas.translate(this.f19676A.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f19676A.offsetTo(0, 0);
        this.f19677d.m16489c(min, min2);
        if (!this.f19681x) {
            this.f19677d.m16482j(min, min2);
        } else if (!this.f19677d.m16490b()) {
            this.f19677d.m16482j(min, min2);
            this.f19677d.m16483i();
        }
        this.f19677d.m16488d(canvas, colorFilter, this.f19676A);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36198d(drawable);
        }
        return this.f19677d.f19731b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f19677d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36197e(drawable);
        }
        return this.f19679f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f19674c != null && Build.VERSION.SDK_INT >= 24) {
            return new C8208i(this.f19674c.getConstantState());
        }
        this.f19677d.f19730a = getChangingConfigurations();
        return this.f19677d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f19677d.f19731b.f19723j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f19677d.f19731b.f19722i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m16514h(boolean z) {
        this.f19681x = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36194h(drawable);
        }
        return this.f19677d.f19734e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C8207h c8207h;
        ColorStateList colorStateList;
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((c8207h = this.f19677d) != null && (c8207h.m16485g() || ((colorStateList = this.f19677d.f19732c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    PorterDuffColorFilter m16512j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f19680w && super.mutate() == this) {
            this.f19677d = new C8207h(this.f19677d);
            this.f19680w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C8207h c8207h = this.f19677d;
        ColorStateList colorStateList = c8207h.f19732c;
        if (colorStateList != null && (mode = c8207h.f19733d) != null) {
            this.f19678e = m16512j(this.f19678e, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c8207h.m16485g() && c8207h.m16484h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f19677d.f19731b.getRootAlpha() != i) {
            this.f19677d.f19731b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36192j(drawable, z);
        } else {
            this.f19677d.f19734e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTint(int i) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36188n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36187o(drawable, colorStateList);
            return;
        }
        C8207h c8207h = this.f19677d;
        if (c8207h.f19732c != colorStateList) {
            c8207h.f19732c = colorStateList;
            this.f19678e = m16512j(this.f19678e, colorStateList, c8207h.f19733d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36186p(drawable, mode);
            return;
        }
        C8207h c8207h = this.f19677d;
        if (c8207h.f19733d != mode) {
            c8207h.f19733d = mode;
            this.f19678e = m16512j(this.f19678e, c8207h.f19732c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$i */
    /* loaded from: classes2.dex */
    public static class C8208i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f19742a;

        public C8208i(Drawable.ConstantState constantState) {
            this.f19742a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f19742a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19742a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C8199i c8199i = new C8199i();
            c8199i.f19674c = (VectorDrawable) this.f19742a.newDrawable();
            return c8199i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C8199i c8199i = new C8199i();
            c8199i.f19674c = (VectorDrawable) this.f19742a.newDrawable(resources);
            return c8199i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C8199i c8199i = new C8199i();
            c8199i.f19674c = (VectorDrawable) this.f19742a.newDrawable(resources, theme);
            return c8199i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f19679f = colorFilter;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8205f extends AbstractC8204e {

        /* renamed from: a */
        protected C7605c.C7607b[] f19709a;

        /* renamed from: b */
        String f19710b;

        /* renamed from: c */
        int f19711c;

        /* renamed from: d */
        int f19712d;

        public AbstractC8205f() {
            super();
            this.f19709a = null;
            this.f19711c = 0;
        }

        /* renamed from: c */
        public boolean mo16500c() {
            return false;
        }

        /* renamed from: d */
        public void m16499d(Path path) {
            path.reset();
            C7605c.C7607b[] c7607bArr = this.f19709a;
            if (c7607bArr != null) {
                C7605c.C7607b.m18046e(c7607bArr, path);
            }
        }

        public C7605c.C7607b[] getPathData() {
            return this.f19709a;
        }

        public String getPathName() {
            return this.f19710b;
        }

        public void setPathData(C7605c.C7607b[] c7607bArr) {
            if (!C7605c.m18059b(this.f19709a, c7607bArr)) {
                this.f19709a = C7605c.m18055f(c7607bArr);
            } else {
                C7605c.m18051j(this.f19709a, c7607bArr);
            }
        }

        public AbstractC8205f(AbstractC8205f abstractC8205f) {
            super();
            this.f19709a = null;
            this.f19711c = 0;
            this.f19710b = abstractC8205f.f19710b;
            this.f19712d = abstractC8205f.f19712d;
            this.f19709a = C7605c.m18055f(abstractC8205f.f19709a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36195g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C8207h c8207h = this.f19677d;
        c8207h.f19731b = new C8206g();
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19647a);
        m16513i(m36221k, xmlPullParser, theme);
        m36221k.recycle();
        c8207h.f19730a = getChangingConfigurations();
        c8207h.f19740k = true;
        m16517e(resources, xmlPullParser, attributeSet, theme);
        this.f19678e = m16512j(this.f19678e, c8207h.f19732c, c8207h.f19733d);
    }

    C8199i(C8207h c8207h) {
        this.f19681x = true;
        this.f19682y = new float[9];
        this.f19683z = new Matrix();
        this.f19676A = new Rect();
        this.f19677d = c8207h;
        this.f19678e = m16512j(this.f19678e, c8207h.f19732c, c8207h.f19733d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$c */
    /* loaded from: classes2.dex */
    public static class C8202c extends AbstractC8205f {

        /* renamed from: e */
        private int[] f19684e;

        /* renamed from: f */
        C1346b f19685f;

        /* renamed from: g */
        float f19686g;

        /* renamed from: h */
        C1346b f19687h;

        /* renamed from: i */
        float f19688i;

        /* renamed from: j */
        float f19689j;

        /* renamed from: k */
        float f19690k;

        /* renamed from: l */
        float f19691l;

        /* renamed from: m */
        float f19692m;

        /* renamed from: n */
        Paint.Cap f19693n;

        /* renamed from: o */
        Paint.Join f19694o;

        /* renamed from: p */
        float f19695p;

        C8202c() {
            this.f19686g = 0.0f;
            this.f19688i = 1.0f;
            this.f19689j = 1.0f;
            this.f19690k = 0.0f;
            this.f19691l = 1.0f;
            this.f19692m = 0.0f;
            this.f19693n = Paint.Cap.BUTT;
            this.f19694o = Paint.Join.MITER;
            this.f19695p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m16509e(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m16508f(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m16506h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f19684e = null;
            if (C1364g.m36222j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f19710b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f19709a = C7605c.m18057d(string2);
                }
                this.f19687h = C1364g.m36227e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f19689j = C1364g.m36226f(typedArray, xmlPullParser, "fillAlpha", 12, this.f19689j);
                this.f19693n = m16509e(C1364g.m36225g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f19693n);
                this.f19694o = m16508f(C1364g.m36225g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f19694o);
                this.f19695p = C1364g.m36226f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f19695p);
                this.f19685f = C1364g.m36227e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f19688i = C1364g.m36226f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f19688i);
                this.f19686g = C1364g.m36226f(typedArray, xmlPullParser, "strokeWidth", 4, this.f19686g);
                this.f19691l = C1364g.m36226f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f19691l);
                this.f19692m = C1364g.m36226f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f19692m);
                this.f19690k = C1364g.m36226f(typedArray, xmlPullParser, "trimPathStart", 5, this.f19690k);
                this.f19711c = C1364g.m36225g(typedArray, xmlPullParser, "fillType", 13, this.f19711c);
            }
        }

        @Override // p201g.p267w.p268a.p269a.C8199i.AbstractC8204e
        /* renamed from: a */
        public boolean mo16502a() {
            return this.f19687h.m36279i() || this.f19685f.m36279i();
        }

        @Override // p201g.p267w.p268a.p269a.C8199i.AbstractC8204e
        /* renamed from: b */
        public boolean mo16501b(int[] iArr) {
            return this.f19685f.m36278j(iArr) | this.f19687h.m36278j(iArr);
        }

        /* renamed from: g */
        public void m16507g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19649c);
            m16506h(m36221k, xmlPullParser, theme);
            m36221k.recycle();
        }

        float getFillAlpha() {
            return this.f19689j;
        }

        int getFillColor() {
            return this.f19687h.m36283e();
        }

        float getStrokeAlpha() {
            return this.f19688i;
        }

        int getStrokeColor() {
            return this.f19685f.m36283e();
        }

        float getStrokeWidth() {
            return this.f19686g;
        }

        float getTrimPathEnd() {
            return this.f19691l;
        }

        float getTrimPathOffset() {
            return this.f19692m;
        }

        float getTrimPathStart() {
            return this.f19690k;
        }

        void setFillAlpha(float f) {
            this.f19689j = f;
        }

        void setFillColor(int i) {
            this.f19687h.m36277k(i);
        }

        void setStrokeAlpha(float f) {
            this.f19688i = f;
        }

        void setStrokeColor(int i) {
            this.f19685f.m36277k(i);
        }

        void setStrokeWidth(float f) {
            this.f19686g = f;
        }

        void setTrimPathEnd(float f) {
            this.f19691l = f;
        }

        void setTrimPathOffset(float f) {
            this.f19692m = f;
        }

        void setTrimPathStart(float f) {
            this.f19690k = f;
        }

        C8202c(C8202c c8202c) {
            super(c8202c);
            this.f19686g = 0.0f;
            this.f19688i = 1.0f;
            this.f19689j = 1.0f;
            this.f19690k = 0.0f;
            this.f19691l = 1.0f;
            this.f19692m = 0.0f;
            this.f19693n = Paint.Cap.BUTT;
            this.f19694o = Paint.Join.MITER;
            this.f19695p = 4.0f;
            this.f19684e = c8202c.f19684e;
            this.f19685f = c8202c.f19685f;
            this.f19686g = c8202c.f19686g;
            this.f19688i = c8202c.f19688i;
            this.f19687h = c8202c.f19687h;
            this.f19711c = c8202c.f19711c;
            this.f19689j = c8202c.f19689j;
            this.f19690k = c8202c.f19690k;
            this.f19691l = c8202c.f19691l;
            this.f19692m = c8202c.f19692m;
            this.f19693n = c8202c.f19693n;
            this.f19694o = c8202c.f19694o;
            this.f19695p = c8202c.f19695p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$g */
    /* loaded from: classes2.dex */
    public static class C8206g {

        /* renamed from: q */
        private static final Matrix f19713q = new Matrix();

        /* renamed from: a */
        private final Path f19714a;

        /* renamed from: b */
        private final Path f19715b;

        /* renamed from: c */
        private final Matrix f19716c;

        /* renamed from: d */
        Paint f19717d;

        /* renamed from: e */
        Paint f19718e;

        /* renamed from: f */
        private PathMeasure f19719f;

        /* renamed from: g */
        private int f19720g;

        /* renamed from: h */
        final C8203d f19721h;

        /* renamed from: i */
        float f19722i;

        /* renamed from: j */
        float f19723j;

        /* renamed from: k */
        float f19724k;

        /* renamed from: l */
        float f19725l;

        /* renamed from: m */
        int f19726m;

        /* renamed from: n */
        String f19727n;

        /* renamed from: o */
        Boolean f19728o;

        /* renamed from: p */
        final C7521a<String, Object> f19729p;

        public C8206g() {
            this.f19716c = new Matrix();
            this.f19722i = 0.0f;
            this.f19723j = 0.0f;
            this.f19724k = 0.0f;
            this.f19725l = 0.0f;
            this.f19726m = 255;
            this.f19727n = null;
            this.f19728o = null;
            this.f19729p = new C7521a<>();
            this.f19721h = new C8203d();
            this.f19714a = new Path();
            this.f19715b = new Path();
        }

        /* renamed from: a */
        private static float m16498a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m16496c(C8203d c8203d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c8203d.f19696a.set(matrix);
            c8203d.f19696a.preConcat(c8203d.f19705j);
            canvas.save();
            for (int i3 = 0; i3 < c8203d.f19697b.size(); i3++) {
                AbstractC8204e abstractC8204e = c8203d.f19697b.get(i3);
                if (abstractC8204e instanceof C8203d) {
                    m16496c((C8203d) abstractC8204e, c8203d.f19696a, canvas, i, i2, colorFilter);
                } else if (abstractC8204e instanceof AbstractC8205f) {
                    m16495d(c8203d, (AbstractC8205f) abstractC8204e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m16495d(C8203d c8203d, AbstractC8205f abstractC8205f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f19724k;
            float f2 = i2 / this.f19725l;
            float min = Math.min(f, f2);
            Matrix matrix = c8203d.f19696a;
            this.f19716c.set(matrix);
            this.f19716c.postScale(f, f2);
            float m16494e = m16494e(matrix);
            if (m16494e == 0.0f) {
                return;
            }
            abstractC8205f.m16499d(this.f19714a);
            Path path = this.f19714a;
            this.f19715b.reset();
            if (abstractC8205f.mo16500c()) {
                this.f19715b.setFillType(abstractC8205f.f19711c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f19715b.addPath(path, this.f19716c);
                canvas.clipPath(this.f19715b);
                return;
            }
            C8202c c8202c = (C8202c) abstractC8205f;
            if (c8202c.f19690k != 0.0f || c8202c.f19691l != 1.0f) {
                float f3 = c8202c.f19690k;
                float f4 = c8202c.f19692m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c8202c.f19691l + f4) % 1.0f;
                if (this.f19719f == null) {
                    this.f19719f = new PathMeasure();
                }
                this.f19719f.setPath(this.f19714a, false);
                float length = this.f19719f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f19719f.getSegment(f7, length, path, true);
                    this.f19719f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f19719f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f19715b.addPath(path, this.f19716c);
            if (c8202c.f19687h.m36276l()) {
                C1346b c1346b = c8202c.f19687h;
                if (this.f19718e == null) {
                    Paint paint = new Paint(1);
                    this.f19718e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f19718e;
                if (c1346b.m36280h()) {
                    Shader m36282f = c1346b.m36282f();
                    m36282f.setLocalMatrix(this.f19716c);
                    paint2.setShader(m36282f);
                    paint2.setAlpha(Math.round(c8202c.f19689j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C8199i.m16521a(c1346b.m36283e(), c8202c.f19689j));
                }
                paint2.setColorFilter(colorFilter);
                this.f19715b.setFillType(c8202c.f19711c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f19715b, paint2);
            }
            if (c8202c.f19685f.m36276l()) {
                C1346b c1346b2 = c8202c.f19685f;
                if (this.f19717d == null) {
                    Paint paint3 = new Paint(1);
                    this.f19717d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f19717d;
                Paint.Join join = c8202c.f19694o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c8202c.f19693n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c8202c.f19695p);
                if (c1346b2.m36280h()) {
                    Shader m36282f2 = c1346b2.m36282f();
                    m36282f2.setLocalMatrix(this.f19716c);
                    paint4.setShader(m36282f2);
                    paint4.setAlpha(Math.round(c8202c.f19688i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C8199i.m16521a(c1346b2.m36283e(), c8202c.f19688i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c8202c.f19686g * min * m16494e);
                canvas.drawPath(this.f19715b, paint4);
            }
        }

        /* renamed from: e */
        private float m16494e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m16498a = m16498a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(m16498a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void m16497b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m16496c(this.f19721h, f19713q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean m16493f() {
            if (this.f19728o == null) {
                this.f19728o = Boolean.valueOf(this.f19721h.mo16502a());
            }
            return this.f19728o.booleanValue();
        }

        /* renamed from: g */
        public boolean m16492g(int[] iArr) {
            return this.f19721h.mo16501b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f19726m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f19726m = i;
        }

        public C8206g(C8206g c8206g) {
            this.f19716c = new Matrix();
            this.f19722i = 0.0f;
            this.f19723j = 0.0f;
            this.f19724k = 0.0f;
            this.f19725l = 0.0f;
            this.f19726m = 255;
            this.f19727n = null;
            this.f19728o = null;
            C7521a<String, Object> c7521a = new C7521a<>();
            this.f19729p = c7521a;
            this.f19721h = new C8203d(c8206g.f19721h, c7521a);
            this.f19714a = new Path(c8206g.f19714a);
            this.f19715b = new Path(c8206g.f19715b);
            this.f19722i = c8206g.f19722i;
            this.f19723j = c8206g.f19723j;
            this.f19724k = c8206g.f19724k;
            this.f19725l = c8206g.f19725l;
            this.f19720g = c8206g.f19720g;
            this.f19726m = c8206g.f19726m;
            this.f19727n = c8206g.f19727n;
            String str = c8206g.f19727n;
            if (str != null) {
                this.f19729p.put(str, this);
            }
            this.f19728o = c8206g.f19728o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: g.w.a.a.i$d */
    /* loaded from: classes2.dex */
    public static class C8203d extends AbstractC8204e {

        /* renamed from: a */
        final Matrix f19696a;

        /* renamed from: b */
        final ArrayList<AbstractC8204e> f19697b;

        /* renamed from: c */
        float f19698c;

        /* renamed from: d */
        private float f19699d;

        /* renamed from: e */
        private float f19700e;

        /* renamed from: f */
        private float f19701f;

        /* renamed from: g */
        private float f19702g;

        /* renamed from: h */
        private float f19703h;

        /* renamed from: i */
        private float f19704i;

        /* renamed from: j */
        final Matrix f19705j;

        /* renamed from: k */
        int f19706k;

        /* renamed from: l */
        private int[] f19707l;

        /* renamed from: m */
        private String f19708m;

        public C8203d(C8203d c8203d, C7521a<String, Object> c7521a) {
            super();
            AbstractC8205f c8201b;
            this.f19696a = new Matrix();
            this.f19697b = new ArrayList<>();
            this.f19698c = 0.0f;
            this.f19699d = 0.0f;
            this.f19700e = 0.0f;
            this.f19701f = 1.0f;
            this.f19702g = 1.0f;
            this.f19703h = 0.0f;
            this.f19704i = 0.0f;
            this.f19705j = new Matrix();
            this.f19708m = null;
            this.f19698c = c8203d.f19698c;
            this.f19699d = c8203d.f19699d;
            this.f19700e = c8203d.f19700e;
            this.f19701f = c8203d.f19701f;
            this.f19702g = c8203d.f19702g;
            this.f19703h = c8203d.f19703h;
            this.f19704i = c8203d.f19704i;
            this.f19707l = c8203d.f19707l;
            String str = c8203d.f19708m;
            this.f19708m = str;
            this.f19706k = c8203d.f19706k;
            if (str != null) {
                c7521a.put(str, this);
            }
            this.f19705j.set(c8203d.f19705j);
            ArrayList<AbstractC8204e> arrayList = c8203d.f19697b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC8204e abstractC8204e = arrayList.get(i);
                if (abstractC8204e instanceof C8203d) {
                    this.f19697b.add(new C8203d((C8203d) abstractC8204e, c7521a));
                } else {
                    if (abstractC8204e instanceof C8202c) {
                        c8201b = new C8202c((C8202c) abstractC8204e);
                    } else if (abstractC8204e instanceof C8201b) {
                        c8201b = new C8201b((C8201b) abstractC8204e);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f19697b.add(c8201b);
                    String str2 = c8201b.f19710b;
                    if (str2 != null) {
                        c7521a.put(str2, c8201b);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m16504d() {
            this.f19705j.reset();
            this.f19705j.postTranslate(-this.f19699d, -this.f19700e);
            this.f19705j.postScale(this.f19701f, this.f19702g);
            this.f19705j.postRotate(this.f19698c, 0.0f, 0.0f);
            this.f19705j.postTranslate(this.f19703h + this.f19699d, this.f19704i + this.f19700e);
        }

        /* renamed from: e */
        private void m16503e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f19707l = null;
            this.f19698c = C1364g.m36226f(typedArray, xmlPullParser, "rotation", 5, this.f19698c);
            this.f19699d = typedArray.getFloat(1, this.f19699d);
            this.f19700e = typedArray.getFloat(2, this.f19700e);
            this.f19701f = C1364g.m36226f(typedArray, xmlPullParser, "scaleX", 3, this.f19701f);
            this.f19702g = C1364g.m36226f(typedArray, xmlPullParser, "scaleY", 4, this.f19702g);
            this.f19703h = C1364g.m36226f(typedArray, xmlPullParser, "translateX", 6, this.f19703h);
            this.f19704i = C1364g.m36226f(typedArray, xmlPullParser, "translateY", 7, this.f19704i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f19708m = string;
            }
            m16504d();
        }

        @Override // p201g.p267w.p268a.p269a.C8199i.AbstractC8204e
        /* renamed from: a */
        public boolean mo16502a() {
            for (int i = 0; i < this.f19697b.size(); i++) {
                if (this.f19697b.get(i).mo16502a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p201g.p267w.p268a.p269a.C8199i.AbstractC8204e
        /* renamed from: b */
        public boolean mo16501b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f19697b.size(); i++) {
                z |= this.f19697b.get(i).mo16501b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m16505c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19648b);
            m16503e(m36221k, xmlPullParser);
            m36221k.recycle();
        }

        public String getGroupName() {
            return this.f19708m;
        }

        public Matrix getLocalMatrix() {
            return this.f19705j;
        }

        public float getPivotX() {
            return this.f19699d;
        }

        public float getPivotY() {
            return this.f19700e;
        }

        public float getRotation() {
            return this.f19698c;
        }

        public float getScaleX() {
            return this.f19701f;
        }

        public float getScaleY() {
            return this.f19702g;
        }

        public float getTranslateX() {
            return this.f19703h;
        }

        public float getTranslateY() {
            return this.f19704i;
        }

        public void setPivotX(float f) {
            if (f != this.f19699d) {
                this.f19699d = f;
                m16504d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f19700e) {
                this.f19700e = f;
                m16504d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f19698c) {
                this.f19698c = f;
                m16504d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f19701f) {
                this.f19701f = f;
                m16504d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f19702g) {
                this.f19702g = f;
                m16504d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f19703h) {
                this.f19703h = f;
                m16504d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f19704i) {
                this.f19704i = f;
                m16504d();
            }
        }

        public C8203d() {
            super();
            this.f19696a = new Matrix();
            this.f19697b = new ArrayList<>();
            this.f19698c = 0.0f;
            this.f19699d = 0.0f;
            this.f19700e = 0.0f;
            this.f19701f = 1.0f;
            this.f19702g = 1.0f;
            this.f19703h = 0.0f;
            this.f19704i = 0.0f;
            this.f19705j = new Matrix();
            this.f19708m = null;
        }
    }
}
