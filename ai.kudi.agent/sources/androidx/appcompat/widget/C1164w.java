package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes2.dex */
public class C1164w {

    /* renamed from: l */
    private static final RectF f3560l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f3561m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f3562n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f3563a = 0;

    /* renamed from: b */
    private boolean f3564b = false;

    /* renamed from: c */
    private float f3565c = -1.0f;

    /* renamed from: d */
    private float f3566d = -1.0f;

    /* renamed from: e */
    private float f3567e = -1.0f;

    /* renamed from: f */
    private int[] f3568f = new int[0];

    /* renamed from: g */
    private boolean f3569g = false;

    /* renamed from: h */
    private TextPaint f3570h;

    /* renamed from: i */
    private final TextView f3571i;

    /* renamed from: j */
    private final Context f3572j;

    /* renamed from: k */
    private final C1167c f3573k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes2.dex */
    private static class C1165a extends C1167c {
        C1165a() {
        }

        @Override // androidx.appcompat.widget.C1164w.C1167c
        /* renamed from: a */
        void mo36910a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1164w.m36919r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes2.dex */
    private static class C1166b extends C1165a {
        C1166b() {
        }

        @Override // androidx.appcompat.widget.C1164w.C1165a, androidx.appcompat.widget.C1164w.C1167c
        /* renamed from: a */
        void mo36910a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C1164w.C1167c
        /* renamed from: b */
        boolean mo36909b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: classes2.dex */
    public static class C1167c {
        C1167c() {
        }

        /* renamed from: a */
        void mo36910a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo36909b(TextView textView) {
            return ((Boolean) C1164w.m36919r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1164w(TextView textView) {
        this.f3571i = textView;
        this.f3572j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f3573k = new C1166b();
        } else if (i >= 23) {
            this.f3573k = new C1165a();
        } else {
            this.f3573k = new C1167c();
        }
    }

    /* renamed from: A */
    private void m36941A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f3568f = m36934c(iArr);
            m36940B();
        }
    }

    /* renamed from: B */
    private boolean m36940B() {
        int length = this.f3568f.length;
        boolean z = length > 0;
        this.f3569g = z;
        if (z) {
            this.f3563a = 1;
            int[] iArr = this.f3568f;
            this.f3566d = iArr[0];
            this.f3567e = iArr[length - 1];
            this.f3565c = -1.0f;
        }
        return this.f3569g;
    }

    /* renamed from: C */
    private boolean m36939C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f3571i.getText();
        TransformationMethod transformationMethod = this.f3571i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f3571i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f3571i.getMaxLines() : -1;
        m36920q(i);
        StaticLayout m36932e = m36932e(text, (Layout.Alignment) m36919r(this.f3571i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m36932e.getLineCount() <= maxLines && m36932e.getLineEnd(m36932e.getLineCount() - 1) == text.length())) && ((float) m36932e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m36938D() {
        return !(this.f3571i instanceof AppCompatEditText);
    }

    /* renamed from: E */
    private void m36937E(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f3563a = 1;
            this.f3566d = f;
            this.f3567e = f2;
            this.f3565c = f3;
            this.f3569g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m36936a(Object obj, String str, T t) {
        try {
            Field m36922o = m36922o(str);
            return m36922o == null ? t : (T) m36922o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m36934c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m36933d() {
        this.f3563a = 0;
        this.f3566d = -1.0f;
        this.f3567e = -1.0f;
        this.f3565c = -1.0f;
        this.f3568f = new int[0];
        this.f3564b = false;
    }

    /* renamed from: f */
    private StaticLayout m36931f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f3570h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f3571i.getLineSpacingExtra(), this.f3571i.getLineSpacingMultiplier()).setIncludePad(this.f3571i.getIncludeFontPadding()).setBreakStrategy(this.f3571i.getBreakStrategy()).setHyphenationFrequency(this.f3571i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f3573k.mo36910a(obtain, this.f3571i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m36930g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f3570h, i, alignment, ((Float) m36936a(this.f3571i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m36936a(this.f3571i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m36936a(this.f3571i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m36929h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f3570h, i, alignment, this.f3571i.getLineSpacingMultiplier(), this.f3571i.getLineSpacingExtra(), this.f3571i.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m36928i(RectF rectF) {
        int length = this.f3568f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m36939C(this.f3568f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f3568f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m36922o(String str) {
        try {
            Field field = f3562n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f3562n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m36921p(String str) {
        try {
            Method method = f3561m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f3561m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m36919r(Object obj, String str, T t) {
        try {
            return (T) m36921p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m36913x(float f) {
        if (f != this.f3571i.getPaint().getTextSize()) {
            this.f3571i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f3571i.isInLayout() : false;
            if (this.f3571i.getLayout() != null) {
                this.f3564b = false;
                try {
                    Method m36921p = m36921p("nullLayouts");
                    if (m36921p != null) {
                        m36921p.invoke(this.f3571i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f3571i.requestLayout();
                } else {
                    this.f3571i.forceLayout();
                }
                this.f3571i.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m36911z() {
        if (m36938D() && this.f3563a == 1) {
            if (!this.f3569g || this.f3568f.length == 0) {
                int floor = ((int) Math.floor((this.f3567e - this.f3566d) / this.f3565c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f3566d + (i * this.f3565c));
                }
                this.f3568f = m36934c(iArr);
            }
            this.f3564b = true;
        } else {
            this.f3564b = false;
        }
        return this.f3564b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36935b() {
        if (m36918s()) {
            if (this.f3564b) {
                if (this.f3571i.getMeasuredHeight() <= 0 || this.f3571i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3573k.mo36909b(this.f3571i) ? 1048576 : (this.f3571i.getMeasuredWidth() - this.f3571i.getTotalPaddingLeft()) - this.f3571i.getTotalPaddingRight();
                int height = (this.f3571i.getHeight() - this.f3571i.getCompoundPaddingBottom()) - this.f3571i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f3560l) {
                    f3560l.setEmpty();
                    f3560l.right = measuredWidth;
                    f3560l.bottom = height;
                    float m36928i = m36928i(f3560l);
                    if (m36928i != this.f3571i.getTextSize()) {
                        m36912y(0, m36928i);
                    }
                }
            }
            this.f3564b = true;
        }
    }

    /* renamed from: e */
    StaticLayout m36932e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return m36931f(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m36929h(charSequence, alignment, i);
        }
        return m36930g(charSequence, alignment, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m36927j() {
        return Math.round(this.f3567e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m36926k() {
        return Math.round(this.f3566d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m36925l() {
        return Math.round(this.f3565c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] m36924m() {
        return this.f3568f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m36923n() {
        return this.f3563a;
    }

    /* renamed from: q */
    void m36920q(int i) {
        TextPaint textPaint = this.f3570h;
        if (textPaint == null) {
            this.f3570h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f3570h.set(this.f3571i.getPaint());
        this.f3570h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m36918s() {
        return m36938D() && this.f3563a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36917t(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f3572j.obtainStyledAttributes(attributeSet, C7461j.AppCompatTextView, i, 0);
        TextView textView = this.f3571i;
        C7759x.m17502n0(textView, textView.getContext(), C7461j.AppCompatTextView, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTextView_autoSizeTextType)) {
            this.f3563a = obtainStyledAttributes.getInt(C7461j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C7461j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C7461j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C7461j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C7461j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C7461j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C7461j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C7461j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m36941A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m36938D()) {
            if (this.f3563a == 1) {
                if (!this.f3569g) {
                    DisplayMetrics displayMetrics = this.f3572j.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    m36937E(dimension2, dimension3, dimension);
                }
                m36911z();
                return;
            }
            return;
        }
        this.f3563a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36916u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m36938D()) {
            DisplayMetrics displayMetrics = this.f3572j.getResources().getDisplayMetrics();
            m36937E(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m36911z()) {
                m36935b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m36915v(int[] iArr, int i) throws IllegalArgumentException {
        if (m36938D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3572j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f3568f = m36934c(iArr2);
                if (!m36940B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f3569g = false;
            }
            if (m36911z()) {
                m36935b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m36914w(int i) {
        if (m36938D()) {
            if (i == 0) {
                m36933d();
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.f3572j.getResources().getDisplayMetrics();
                m36937E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (m36911z()) {
                    m36935b();
                }
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36912y(int i, float f) {
        Resources resources;
        Context context = this.f3572j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m36913x(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
