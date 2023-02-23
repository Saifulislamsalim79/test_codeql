package ai.kudi.dip.library.keypad;

import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0771c;
import ai.kudi.dip.library.C0799g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.C1335a;
import androidx.core.content.p057e.C1355f;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11837e;
import kotlin.p548k0.C13240m;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p201g.p227h.p238l.C7759x;
/* compiled from: PinpadView.kt */
@Metadata(m10422d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0005MNOPQB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\u0018\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001b2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u000e\u0010*\u001a\u00020$2\u0006\u0010&\u001a\u00020\nJ\u0010\u0010+\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020$2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0016J0\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0014J\u0018\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0014J\u0006\u0010,\u001a\u00020$J\b\u0010;\u001a\u00020$H\u0002J\u000e\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020\nJ\u000e\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020\u0015J\u000e\u0010C\u001a\u00020$2\u0006\u0010@\u001a\u00020\nJ\u000e\u0010D\u001a\u00020$2\u0006\u0010B\u001a\u00020\u0015J\u000e\u0010E\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020\nJ\u000e\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020JJ\u000e\u0010!\u001a\u00020$2\u0006\u0010K\u001a\u00020LR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006R"}, m10421d2 = {"Lai/kudi/dip/library/keypad/PinpadView;", "Landroid/view/ViewGroup;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "callback", "Lai/kudi/dip/library/keypad/PinpadView$Callback;", "getCallback", "()Lai/kudi/dip/library/keypad/PinpadView$Callback;", "setCallback", "(Lai/kudi/dip/library/keypad/PinpadView$Callback;)V", "keySpacing", "", "keys", "", "Lai/kudi/dip/library/keypad/PinpadView$Key;", "numDigits", "passcode", "", "textColor", "viewProvider", "Lai/kudi/dip/library/keypad/PinpadView$ViewProvider;", "getViewProvider", "()Lai/kudi/dip/library/keypad/PinpadView$ViewProvider;", "setViewProvider", "(Lai/kudi/dip/library/keypad/PinpadView$ViewProvider;)V", "appendText", "", AttributeType.TEXT, "startPosition", "childrenSequence", "Lkotlin/sequences/Sequence;", "Lai/kudi/dip/library/keypad/PinpadView$KeyView;", "deleteChar", "fail", "reset", "", "initAttrs", "onClick", "v", "Landroid/view/View;", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "runFailAnimation", "setKeyBackgroundDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setKeySubTextColor", "color", "setKeySubTextSize", "size", "setKeyTextColor", "setKeyTextSize", "setPasscode", "setSpacing", "spacing", "setTypeface", "tf", "Landroid/graphics/Typeface;", "pinTextView", "Lai/kudi/dip/library/keypad/PinTextView;", "Callback", "Companion", "Key", "KeyView", "ViewProvider", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PinpadView extends ViewGroup implements View.OnClickListener {

    /* renamed from: c */
    private float f2338c;

    /* renamed from: d */
    private int f2339d;

    /* renamed from: e */
    private String f2340e;

    /* renamed from: f */
    private InterfaceC0836d f2341f;

    /* renamed from: w */
    private InterfaceC0833a f2342w;

    /* renamed from: x */
    private final List<C0834b> f2343x;

    /* compiled from: PinpadView.kt */
    /* renamed from: ai.kudi.dip.library.keypad.PinpadView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0833a {
        /* renamed from: a */
        void m37904a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PinpadView.kt */
    /* renamed from: ai.kudi.dip.library.keypad.PinpadView$b */
    /* loaded from: classes2.dex */
    public static final class C0834b {

        /* renamed from: a */
        private final String f2344a;

        /* renamed from: b */
        private final String f2345b;

        static {
            new C0834b("\u0000", "");
        }

        public C0834b(String str, String str2) {
            l.f(str, "char");
            l.f(str2, "subText");
            this.f2344a = str;
            this.f2345b = str2;
        }

        /* renamed from: a */
        public final String m37903a() {
            return this.f2344a;
        }

        /* renamed from: b */
        public final String m37902b() {
            return this.f2345b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0834b) && l.b(this.f2344a, ((C0834b) obj).f2344a);
        }

        public int hashCode() {
            return this.f2344a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PinpadView.kt */
    /* renamed from: ai.kudi.dip.library.keypad.PinpadView$c */
    /* loaded from: classes2.dex */
    public static final class C0835c extends AppCompatImageButton {

        /* renamed from: e */
        private final C0834b f2346e;

        /* renamed from: f */
        private final Paint f2347f;

        /* renamed from: w */
        private final Paint f2348w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0835c(Context context, TypedArray typedArray, C0834b c0834b) {
            super(context);
            l.f(context, "context");
            l.f(typedArray, "attrs");
            l.f(c0834b, "key");
            this.f2346e = c0834b;
            Paint paint = new Paint(69);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTextSize(typedArray.getDimension(C0799g.PinpadView_textSize, 0.0f));
            paint.setColor(typedArray.getColor(C0799g.PinpadView_textColor, 0));
            C13666w c13666w = C13666w.f30112a;
            this.f2347f = paint;
            Paint paint2 = new Paint(69);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTextSize(typedArray.getDimension(C0799g.PinpadView_subTextSize, 0.0f));
            paint2.setColor(typedArray.getColor(C0799g.PinpadView_subTextColor, 0));
            C13666w c13666w2 = C13666w.f30112a;
            this.f2348w = paint2;
            Typeface m36245e = C1355f.m36245e(context, typedArray.getResourceId(C0799g.PinpadView_fontSource, C0771c.garant));
            l.d(m36245e);
            l.e(m36245e, "getFont(context, fontPath)!!");
            m37896f(m36245e);
        }

        /* renamed from: a */
        public final C0834b m37901a() {
            return this.f2346e;
        }

        /* renamed from: b */
        public final void m37900b(int i) {
            this.f2348w.setColor(i);
        }

        /* renamed from: c */
        public final void m37899c(float f) {
            this.f2348w.setTextSize(f);
        }

        /* renamed from: d */
        public final void m37898d(int i) {
            this.f2347f.setColor(i);
        }

        /* renamed from: e */
        public final void m37897e(float f) {
            this.f2347f.setTextSize(f);
        }

        /* renamed from: f */
        public final void m37896f(Typeface typeface) {
            l.f(typeface, "typeface");
            this.f2347f.setTypeface(typeface);
            this.f2348w.setTypeface(typeface);
        }

        @Override // android.widget.ImageView, android.view.View
        protected void onDraw(Canvas canvas) {
            boolean m5440u;
            l.f(canvas, "canvas");
            super.onDraw(canvas);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawText(this.f2346e.m37903a(), rectF.centerX(), rectF.centerY() + (((this.f2347f.descent() - this.f2347f.ascent()) / 2) - this.f2347f.descent()), this.f2347f);
            m5440u = C13276s.m5440u(this.f2346e.m37902b());
            if (!m5440u) {
                canvas.drawText(this.f2346e.m37902b(), getWidth() / 2.0f, (getHeight() - getPaddingBottom()) - this.f2348w.descent(), this.f2348w);
            }
        }

        @Override // android.widget.ImageView, android.view.View
        protected void onMeasure(int i, int i2) {
            boolean m5440u;
            float paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f2347f.measureText(this.f2346e.m37903a()), this.f2348w.measureText(this.f2346e.m37902b()));
            float paddingTop = getPaddingTop() + getPaddingBottom() + C0838a.m37893b(this.f2347f);
            m5440u = C13276s.m5440u(this.f2346e.m37902b());
            if (!m5440u) {
                paddingTop += C0838a.m37893b(this.f2348w);
            }
            setMeasuredDimension(ImageButton.resolveSizeAndState((int) paddingLeft, i, 0), ImageButton.resolveSizeAndState((int) paddingTop, i2, 50));
        }
    }

    /* compiled from: PinpadView.kt */
    /* renamed from: ai.kudi.dip.library.keypad.PinpadView$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC0836d {
        void onAppendChar(String str);

        void onDeleteChar();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinpadView.kt */
    /* renamed from: ai.kudi.dip.library.keypad.PinpadView$e */
    /* loaded from: classes2.dex */
    public static final class C0837e extends AbstractC11802m implements InterfaceC11767l<Integer, View> {
        C0837e() {
            super(1);
        }

        /* renamed from: a */
        public final View m37895a(int i) {
            return PinpadView.this.getChildAt(i);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ View invoke(Integer num) {
            return m37895a(num.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinpadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
        m37905b(attributeSet);
    }

    /* renamed from: a */
    private final InterfaceC13230h<C0835c> m37906a() {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5569r;
        InterfaceC13230h<C0835c> m5579i;
        m3818H = C13742z.m3818H(new C11837e(0, getChildCount() - 1));
        m5569r = C13242n.m5569r(m3818H, new C0837e());
        m5579i = C13240m.m5579i(m5569r, C0835c.class);
        return m5579i;
    }

    /* renamed from: b */
    public final void m37905b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0799g.PinpadView, 0, 0);
        setBackgroundColor(C1335a.m36324d(getContext(), C0755a.keypad_background));
        try {
            this.f2338c = obtainStyledAttributes.getDimension(C0799g.PinpadView_keySpacing, 0.0f);
            obtainStyledAttributes.getInt(C0799g.PinpadView_numDigits, 0);
            this.f2339d = obtainStyledAttributes.getColor(C0799g.PinpadView_textColor, C1335a.m36324d(getContext(), C0755a.keypad_textColor));
            for (C0834b c0834b : this.f2343x) {
                Context context = getContext();
                l.e(context, "context");
                l.e(obtainStyledAttributes, "values");
                C0835c c0835c = new C0835c(context, obtainStyledAttributes, c0834b);
                int i = (int) this.f2338c;
                c0835c.setPadding(i, i, i, i);
                C7759x.m17492s0(c0835c, C1335a.m36322f(getContext(), obtainStyledAttributes.getResourceId(C0799g.PinpadView_keyBackground, C0756b.curved_fill_white_border_grey)));
                c0835c.setHapticFeedbackEnabled(true);
                c0835c.setOnClickListener(this);
                c0835c.m37898d(this.f2339d);
                c0835c.m37897e(obtainStyledAttributes.getDimension(C0799g.PinpadView_textSize, 60.0f));
                addView(c0835c);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final InterfaceC0833a getCallback() {
        return this.f2342w;
    }

    public final InterfaceC0836d getViewProvider() {
        return this.f2341f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m5410Q;
        l.f(view, "v");
        if (view instanceof C0835c) {
            view.performHapticFeedback(3);
            String m37903a = ((C0835c) view).m37901a().m37903a();
            if (l.b(m37903a, "⌫")) {
                if (this.f2340e.length() > 0) {
                    String str = this.f2340e;
                    m5410Q = C13277t.m5410Q(str);
                    this.f2340e = C0838a.m37894a(str, m5410Q);
                    InterfaceC0836d interfaceC0836d = this.f2341f;
                    if (interfaceC0836d == null) {
                        return;
                    }
                    interfaceC0836d.onDeleteChar();
                }
            } else if (l.b(m37903a, "❓")) {
                InterfaceC0833a interfaceC0833a = this.f2342w;
                if (interfaceC0833a == null) {
                    return;
                }
                interfaceC0833a.m37904a();
            } else {
                this.f2340e = l.m(this.f2340e, m37903a);
                InterfaceC0836d interfaceC0836d2 = this.f2341f;
                if (interfaceC0836d2 == null) {
                    return;
                }
                interfaceC0836d2.onAppendChar(m37903a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i4 - i2;
        float f = 4;
        float paddingLeft = ((((i3 - i) - getPaddingLeft()) - getPaddingRight()) - (this.f2338c * f)) / 3;
        float paddingTop = (((i7 - getPaddingTop()) - getPaddingBottom()) - (this.f2338c * 5)) / f;
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            View childAt = getChildAt(i8);
            float paddingLeft2 = getPaddingLeft() + (this.f2338c * (i5 + 1)) + ((i8 % 3) * paddingLeft);
            float paddingTop2 = getPaddingTop() + (this.f2338c * (i6 + 1)) + ((i8 / 3) * paddingTop);
            childAt.layout((int) paddingLeft2, (int) paddingTop2, (int) (paddingLeft2 + paddingLeft), (int) (paddingTop2 + paddingTop));
            if (i8 == childCount) {
                return;
            }
            i8 = i9;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (getChildCount() != this.f2343x.size()) {
            super.onMeasure(i, i2);
            return;
        }
        float f = 4;
        float paddingLeft = getPaddingLeft() + getPaddingRight() + (this.f2338c * f);
        float paddingTop = getPaddingTop() + getPaddingBottom() + (this.f2338c * 5);
        float size = (View.MeasureSpec.getSize(i2) - paddingTop) / f;
        View childAt = getChildAt(1);
        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) - paddingLeft) / 3), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((int) size, View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(ViewGroup.resolveSizeAndState((int) (paddingLeft + (childAt.getMeasuredWidth() * 3)), i, View.MeasureSpec.getMode(i)), ViewGroup.resolveSizeAndState((int) (paddingTop + (childAt.getMeasuredHeight() * 4)), i2, View.MeasureSpec.getMode(i2)));
    }

    public final void setCallback(InterfaceC0833a interfaceC0833a) {
        this.f2342w = interfaceC0833a;
    }

    public final void setKeyBackgroundDrawable(Drawable drawable) {
        l.f(drawable, "drawable");
        for (C0835c c0835c : m37906a()) {
            C7759x.m17492s0(c0835c, drawable);
        }
    }

    public final void setKeySubTextColor(int i) {
        for (C0835c c0835c : m37906a()) {
            c0835c.m37900b(i);
        }
        invalidate();
    }

    public final void setKeySubTextSize(float f) {
        for (C0835c c0835c : m37906a()) {
            c0835c.m37899c(f);
        }
        requestLayout();
        invalidate();
    }

    public final void setKeyTextColor(int i) {
        for (C0835c c0835c : m37906a()) {
            c0835c.m37898d(i);
        }
        invalidate();
    }

    public final void setKeyTextSize(float f) {
        for (C0835c c0835c : m37906a()) {
            c0835c.m37897e(f);
        }
        requestLayout();
        invalidate();
    }

    public final void setPasscode(String str) {
        l.f(str, "passcode");
        this.f2340e = str;
    }

    public final void setSpacing(int i) {
        for (C0835c c0835c : m37906a()) {
            c0835c.setPadding(i, i, i, i);
        }
        this.f2338c = i;
        requestLayout();
        invalidate();
    }

    public final void setTypeface(Typeface typeface) {
        l.f(typeface, "tf");
        for (C0835c c0835c : m37906a()) {
            c0835c.m37896f(typeface);
        }
        requestLayout();
        invalidate();
    }

    public final void setViewProvider(InterfaceC0836d interfaceC0836d) {
        this.f2341f = interfaceC0836d;
    }

    public final void setViewProvider(C0839b c0839b) {
        l.f(c0839b, "pinTextView");
        this.f2341f = c0839b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinpadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List<C0834b> m3888h;
        l.f(context, "context");
        this.f2339d = C1335a.m36324d(getContext(), C0755a.keypad_textColor);
        this.f2340e = "";
        m3888h = C13726r.m3888h(new C0834b("1", ""), new C0834b("2", ""), new C0834b("3", ""), new C0834b("4", ""), new C0834b("5", ""), new C0834b("6", ""), new C0834b("7", ""), new C0834b("8", ""), new C0834b("9", ""), new C0834b("00", ""), new C0834b("0", ""), new C0834b("⌫", ""));
        this.f2343x = m3888h;
        m37905b(attributeSet);
    }
}
