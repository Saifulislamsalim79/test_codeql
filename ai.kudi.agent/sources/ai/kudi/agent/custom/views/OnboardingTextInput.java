package ai.kudi.agent.custom.views;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.pin.KudiPin;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13721o0;
import kotlin.p557z.C13723p0;
import kotlin.p557z.C13727r0;
import p272h.p368e.p369a.AbstractC9419a;
import p272h.p368e.p369a.p371c.C9421a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OnboardingTextInput.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0015\u0018\u0000 E2\u00020\u0001:\u0002EFB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00108\u001a\u00020$H\u0002J\u001a\u00109\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010:\u001a\u00020\u0012H\u0016J\u0006\u0010;\u001a\u00020\u0012J\u0006\u0010<\u001a\u00020$J\u000e\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020\tJ\u0010\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020\tH\u0016J\u0010\u0010A\u001a\u00020$2\b\u0010B\u001a\u0004\u0018\u00010\u0010J\b\u0010C\u001a\u00020$H\u0002J\u0006\u0010D\u001a\u00020$R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u000202018F¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/¨\u0006G"}, m10421d2 = {"Lai/kudi/agent/custom/views/OnboardingTextInput;", "Lai/kudi/agent/custom/views/KudiTextInput;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "errorImageView", "Landroid/widget/ImageView;", "errorTextView", "Landroid/widget/TextView;", "hint", "", "inputEditText", "Landroid/widget/EditText;", "getInputEditText", "()Landroid/widget/EditText;", "inputTextView", "getInputTextView", "()Landroid/widget/TextView;", "inputType", "isBorderVisible", "", "loadingProgressBar", "Landroid/widget/ProgressBar;", "maxLength", "onClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "shouldFocus", "value", AttributeType.TEXT, "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textChanges", "Lio/reactivex/Observable;", "", "getTextChanges", "()Lio/reactivex/Observable;", KudiPin.KUDI_PIN_TITLE, "getTitle", "setTitle", "applyAttributes", "extractAttributes", "getEditText", "getEditableView", "hideLoading", "setDrawableRight", "drawable", "setEditTextId", "id", "setError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "setHint", "showLoading", "Companion", "ItalicizedTypeface", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardingTextInput extends KudiTextInput {
    public static final Companion Companion;
    private static final Map<Integer, Integer> inputTypeMap;
    private final ImageView errorImageView;
    private final TextView errorTextView;
    private String hint;
    private final EditText inputEditText;
    private final TextView inputTextView;
    private int inputType;
    private boolean isBorderVisible;
    private final ProgressBar loadingProgressBar;
    private int maxLength;
    private InterfaceC11767l<? super View, C13666w> onClickListener;
    private int shouldFocus;
    private String title;

    /* compiled from: OnboardingTextInput.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/custom/views/OnboardingTextInput$Companion;", "", "()V", "inputTypeMap", "", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: OnboardingTextInput.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0016¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/custom/views/OnboardingTextInput$ItalicizedTypeface;", "Landroid/text/style/TypefaceSpan;", "()V", "applyCustomTypeFace", "", "paint", "Landroid/graphics/Paint;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ItalicizedTypeface extends TypefaceSpan {
        public ItalicizedTypeface() {
            super("");
        }

        private final void applyCustomTypeFace(Paint paint) {
            paint.setTextSkewX(-0.25f);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Log_OC.getArray(textPaint, "ds");
            applyCustomTypeFace(textPaint);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            Log_OC.getArray(textPaint, "paint");
            applyCustomTypeFace(textPaint);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Map $r5;
        Map $r52;
        Companion $r0 = new Companion(null);
        Companion = $r0;
        C13287o $r4 = C13664u.m4227a(0, 1);
        C13287o $r42 = C13664u.m4227a(1, 2);
        C13287o $r43 = C13664u.m4227a(2, 33);
        C13287o $r44 = C13664u.m4227a(3, 129);
        C13287o $r45 = C13664u.m4227a(4, 18);
        Integer $r2 = Integer.valueOf((int) IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_TCP_OPEN);
        C13287o $r46 = C13664u.m4227a(5, $r2);
        C13287o $r47 = C13664u.m4227a(6, 8194);
        C13287o[] $r1 = {$r4, $r42, $r43, $r44, $r45, $r46, $r47};
        $r5 = C13727r0.m3878n($r1);
        OnboardingTextInput$Companion$inputTypeMap$1 $r6 = OnboardingTextInput$Companion$inputTypeMap$1.INSTANCE;
        $r52 = C13723p0.m3904b($r5, $r6);
        inputTypeMap = $r52;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingTextInput(Context context) {
        this(context, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingTextInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OnboardingTextInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log_OC.getArray(context, "context");
        this.title = "";
        this.hint = "";
        this.shouldFocus = 1;
        OnboardingTextInput r10 = this;
        View.inflate(context, C0001R.C0004layout.custom_views_onboarding_text_input, r10);
        extractAttributes(context, attributeSet);
        OnboardingTextInput r102 = this;
        View $r3 = r102.findViewById(C0001R.C0003id.inputTextView);
        Log_OC.loadImage($r3, "findViewById(R.id.inputTextView)");
        TextView $r4 = (TextView) $r3;
        this.inputTextView = $r4;
        OnboardingTextInput r103 = this;
        View $r32 = r103.findViewById(C0001R.C0003id.inputEditText);
        Log_OC.loadImage($r32, "findViewById(R.id.inputEditText)");
        EditText $r5 = (EditText) $r32;
        this.inputEditText = $r5;
        OnboardingTextInput r104 = this;
        View $r33 = r104.findViewById(C0001R.C0003id.errorTextView);
        Log_OC.loadImage($r33, "findViewById(R.id.errorTextView)");
        TextView $r42 = (TextView) $r33;
        this.errorTextView = $r42;
        OnboardingTextInput r105 = this;
        View $r34 = r105.findViewById(C0001R.C0003id.errorImageView);
        Log_OC.loadImage($r34, "findViewById(R.id.errorImageView)");
        ImageView $r6 = (ImageView) $r34;
        this.errorImageView = $r6;
        OnboardingTextInput r106 = this;
        View $r35 = r106.findViewById(C0001R.C0003id.progressLoader);
        Log_OC.loadImage($r35, "findViewById(R.id.progressLoader)");
        ProgressBar $r7 = (ProgressBar) $r35;
        this.loadingProgressBar = $r7;
        TextView $r43 = this.errorTextView;
        $r43.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.custom.views.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingTextInput $r2 = OnboardingTextInput.this;
                OnboardingTextInput.m39190_init_$lambda0($r2, view);
            }
        });
        applyAttributes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m39190_init_$lambda0(OnboardingTextInput onboardingTextInput, View view) {
        Log_OC.getArray(onboardingTextInput, "this$0");
        EditText $r0 = onboardingTextInput.getInputEditText();
        $r0.requestFocus();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyAttributes() {
        TextView $r2 = this.inputTextView;
        String $r3 = this.title;
        $r2.setText($r3);
        setHint();
        EditText $r4 = this.inputEditText;
        Map $r5 = inputTypeMap;
        int $i0 = this.inputType;
        Integer $r6 = Integer.valueOf($i0);
        Object $r7 = C13721o0.m3982l($r5, $r6);
        Number $r8 = (Number) $r7;
        int $i02 = $r8.intValue();
        $r4.setInputType($i02);
        int $i03 = this.maxLength;
        if ($i03 != 0 && $i03 > 0) {
            EditText $r42 = this.inputEditText;
            int $i04 = this.maxLength;
            InputFilter.LengthFilter $r1 = new InputFilter.LengthFilter($i04);
            InputFilter.LengthFilter[] $r9 = {$r1};
            $r42.setFilters($r9);
        }
        EditText $r43 = this.inputEditText;
        $r43.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.custom.views.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingTextInput $r22 = OnboardingTextInput.this;
                OnboardingTextInput.m39191applyAttributes$lambda1($r22, view);
            }
        });
        EditText $r44 = this.inputEditText;
        int $i05 = this.shouldFocus;
        boolean $z0 = $i05 == 1;
        $r44.setFocusableInTouchMode($z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyAttributes$lambda-1  reason: not valid java name */
    public static final void m39191applyAttributes$lambda1(OnboardingTextInput onboardingTextInput, View view) {
        Log_OC.getArray(onboardingTextInput, "this$0");
        InterfaceC11767l $r1 = onboardingTextInput.getOnClickListener();
        if ($r1 == null) {
            return;
        }
        Log_OC.loadImage(view, "it");
        $r1.invoke(view);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void extractAttributes(Context context, AttributeSet attributeSet) {
        int[] $r3 = C0001R.styleable.OnboardingTextInput;
        TypedArray $r4 = context.obtainStyledAttributes(attributeSet, $r3);
        Log_OC.loadImage($r4, "context.obtainStyledAttributes(attrs, R.styleable.OnboardingTextInput)");
        try {
            boolean $z0 = $r4.getBoolean(1, true);
            this.isBorderVisible = $z0;
            String $r5 = $r4.getString(8);
            String $r6 = $r5;
            if ($r5 == null) {
                $r6 = "";
            }
            this.title = $r6;
            String $r52 = $r4.getString(3);
            String $r7 = $r52 != null ? $r52 : "";
            this.hint = $r7;
            int $i0 = $r4.getInteger(4, 0);
            this.inputType = $i0;
            int $i02 = $r4.getInteger(5, 0);
            this.maxLength = $i02;
            int $i03 = $r4.getInteger(2, 1);
            this.shouldFocus = $i03;
        } finally {
            $r4.recycle();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setHint() {
        EditText $r1 = this.inputEditText;
        String $r3 = this.hint;
        SpannableString $r2 = new SpannableString($r3);
        ItalicizedTypeface $r4 = new ItalicizedTypeface();
        int $i0 = $r2.length();
        $r2.setSpan($r4, 0, $i0, 17);
        C13666w c13666w = C13666w.f30112a;
        $r1.setHint($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.custom.views.KudiTextInput
    public EditText getEditText() {
        EditText r1 = this.inputEditText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EditText getEditableView() {
        EditText r1 = this.inputEditText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EditText getInputEditText() {
        EditText r1 = this.inputEditText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TextView getInputTextView() {
        TextView r1 = this.inputTextView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnClickListener() {
        InterfaceC11767l r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getText() {
        EditText $r1 = this.inputEditText;
        Editable $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getTextChanges() {
        EditText $r1 = this.inputEditText;
        AbstractC9419a $r2 = C9421a.m14785a($r1);
        Log_OC.m10360a($r2, "RxTextView.textChanges(this)");
        TimeUnit $r3 = TimeUnit.MILLISECONDS;
        AbstractC11688p $r4 = $r2.m10492r(150L, $r3);
        AbstractC11688p $r42 = $r4.m10523W();
        p425j.p444e.Item $r5 = ContextUtils.LogError();
        AbstractC11688p $r43 = $r42.R($r5);
        Log_OC.loadImage($r43, "inputEditText.textChanges()\n            .debounce(150, TimeUnit.MILLISECONDS)\n            .retry() // retry ensures re-subscription after a failure\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTitle() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoading() {
        ProgressBar $r1 = this.loadingProgressBar;
        ViewExtKt.hide($r1, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setDrawableRight(int i) {
        EditText $r1 = this.inputEditText;
        $r1.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.custom.views.KudiTextInput
    public void setEditTextId(int i) {
        EditText $r1 = this.inputEditText;
        $r1.setId(i);
    }

    public final void setError(String str) {
        if (str == null) {
            hideError();
        } else {
            showError(str);
        }
    }

    public final void setOnClickListener(InterfaceC11767l interfaceC11767l) {
        this.onClickListener = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setText(String str) {
        Log_OC.getArray(str, "value");
        EditText $r2 = this.inputEditText;
        $r2.setText(str);
    }

    public final void setTitle(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        ProgressBar $r1 = this.loadingProgressBar;
        ViewExtKt.show($r1);
    }
}
