package ai.kudi.dip.library.edittext;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0799g;
import ai.kudi.dip.library.edittext.p042d.C0794a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1335a;
import java.util.Map;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13721o0;
import p201g.p227h.p238l.C7678a0;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: BaseKudiInputField.kt */
/* renamed from: ai.kudi.dip.library.edittext.c */
/* loaded from: classes2.dex */
public abstract class AbstractC0790c extends ConstraintLayout {
    public static final int EMAIL_ADDRESS = 2;
    public static final int MULTILINE = 5;
    public static final int NUMBER = 1;
    public static final int NUMBER_DECIMAL = 6;
    public static final int NUMBER_PASSWORD = 4;
    public static final int PASSWORD = 3;
    public static final int TEXT = 0;
    public static final int TEXT_PERSON_NAME = 7;
    private String errorText;
    private final TextView errorTextView;
    private TextView hintField;
    private String hintText;
    private ImageView iconView;
    private final EditText inputEditText;
    private Integer inputFieldIcon;
    private final ViewGroup inputLayout;
    private int inputType;
    private String labelText;
    private int maxLength;
    private final GradientDrawable shapeDrawable;
    public static final C0792b Companion = new C0792b(null);
    private static final Map<Integer, Integer> inputTypeMap = C13721o0.m3991b(C13721o0.m3980n(C13664u.m4227a(0, 1), C13664u.m4227a(1, 2), C13664u.m4227a(2, 33), C13664u.m4227a(3, 129), C13664u.m4227a(4, 18), C13664u.m4227a(5, Integer.valueOf((int) IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_TCP_OPEN)), C13664u.m4227a(6, 8194), C13664u.m4227a(7, 97)), C0791a.f2233c);

    /* compiled from: BaseKudiInputField.kt */
    /* renamed from: ai.kudi.dip.library.edittext.c$a */
    /* loaded from: classes2.dex */
    static final class C0791a extends AbstractC11802m implements InterfaceC11767l<Integer, Integer> {

        /* renamed from: c */
        public static final C0791a f2233c = new C0791a();

        C0791a() {
            super(1);
        }

        public final int invoke(int i) {
            return 1;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(invoke(num.intValue()));
        }
    }

    /* compiled from: BaseKudiInputField.kt */
    /* renamed from: ai.kudi.dip.library.edittext.c$b */
    /* loaded from: classes2.dex */
    public static final class C0792b {
        private C0792b() {
        }

        public /* synthetic */ C0792b(g gVar) {
            this();
        }
    }

    /* compiled from: BaseKudiInputField.kt */
    /* renamed from: ai.kudi.dip.library.edittext.c$c */
    /* loaded from: classes2.dex */
    public static final class C0793c implements TextWatcher {
        C0793c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            l.d(editable);
            if (editable.length() > 0) {
                AbstractC0790c.this.getHintField().setVisibility(0);
                AbstractC0790c.this.getHintField().setTextColor(C1335a.m36324d(AbstractC0790c.this.getContext(), C0755a.kudiInputFieldHintColor));
                AbstractC0790c.this.getInputEditText().setTextColor(C1335a.m36324d(AbstractC0790c.this.getContext(), C0755a.colorPrimary));
                AbstractC0790c.this.shapeDrawable.setStroke(1, C1335a.m36324d(AbstractC0790c.this.getContext(), C0755a.kudiInputFieldBackgroundColor));
                AbstractC0790c.this.getErrorTextView().setVisibility(8);
                if (editable.length() <= 1) {
                    AbstractC0790c.this.shapeDrawable.setStroke(1, C1335a.m36324d(AbstractC0790c.this.getContext(), C0755a.kudiInputFieldBackgroundColor));
                }
                AbstractC0790c.this.getInputLayout().setBackground(AbstractC0790c.this.shapeDrawable);
                return;
            }
            AbstractC0790c.this.getHintField().setVisibility(8);
            AbstractC0790c.this.getErrorTextView().setVisibility(8);
            AbstractC0790c.this.shapeDrawable.setStroke(1, C1335a.m36324d(AbstractC0790c.this.getContext(), C0755a.kudiInputFieldBackgroundColor));
            AbstractC0790c.this.getInputLayout().setBackground(AbstractC0790c.this.shapeDrawable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC0790c(Context context) {
        this(context, null, 0, 6, null);
        l.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC0790c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public /* synthetic */ AbstractC0790c(Context context, AttributeSet attributeSet, int i, int i2, g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void extractAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0799g.KudiInputField);
        try {
            this.errorText = obtainStyledAttributes.getString(C0799g.KudiInputField_KIF_errorText);
            this.hintText = obtainStyledAttributes.getString(C0799g.KudiInputField_KIF_hintText);
            this.maxLength = obtainStyledAttributes.getInt(C0799g.KudiInputField_KIF_maxLength, this.maxLength);
            this.inputType = obtainStyledAttributes.getInt(C0799g.KudiInputField_KIF_inputType, 0);
            this.labelText = obtainStyledAttributes.getString(C0799g.KudiInputField_KIF_labelText);
            this.inputFieldIcon = Integer.valueOf(obtainStyledAttributes.getResourceId(C0799g.KudiInputField_KIF_icon, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void restoreChildViewStates(ViewGroup viewGroup, SparseArray<Parcelable> sparseArray) {
        for (View view : C7678a0.m17853b(viewGroup)) {
            view.restoreHierarchyState(sparseArray);
        }
    }

    private final SparseArray<Parcelable> saveChildViewStates(ViewGroup viewGroup) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        for (View view : C7678a0.m17853b(viewGroup)) {
            view.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setClickedListener$lambda-2  reason: not valid java name */
    public static final void m41877setClickedListener$lambda2(InterfaceC11767l interfaceC11767l, View view) {
        l.f(interfaceC11767l, "$action");
        l.e(view, "it");
        interfaceC11767l.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setClickedListener$lambda-3  reason: not valid java name */
    public static final void m41878setClickedListener$lambda3(InterfaceC11767l interfaceC11767l, View view) {
        l.f(interfaceC11767l, "$action");
        l.e(view, "it");
        interfaceC11767l.invoke(view);
    }

    public void applyAttributes() {
        this.inputEditText.setInputType(((Number) C13721o0.m3982l(inputTypeMap, Integer.valueOf(this.inputType))).intValue());
        this.inputEditText.setTypeface(Typeface.DEFAULT);
        this.inputEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.maxLength)});
        this.inputEditText.setHint(this.hintText);
        String str = this.errorText;
        if (str != null) {
            getErrorTextView().setText(str);
        }
        TextView textView = this.hintField;
        String str2 = this.labelText;
        if (str2 == null) {
            str2 = this.hintText;
        }
        textView.setText(str2);
        Integer num = this.inputFieldIcon;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.inputFieldIcon;
            if (num2 == null || num2.intValue() != 0) {
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.iconView;
                if (imageView2 != null) {
                    imageView2.setImageResource(intValue);
                }
            } else {
                ImageView imageView3 = this.iconView;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
            }
        }
        handleTextChanges();
    }

    public final void disableEditablity() {
        getEditText().setClickable(true);
        getEditText().setFocusable(false);
    }

    public final EditText getEditText() {
        return this.inputEditText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getErrorTextView() {
        return this.errorTextView;
    }

    public final TextView getHintField() {
        return this.hintField;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final EditText getInputEditText() {
        return this.inputEditText;
    }

    public final ViewGroup getInputLayout() {
        return this.inputLayout;
    }

    public final int getInputType() {
        return this.inputType;
    }

    public final String getText() {
        return this.inputEditText.getText().toString();
    }

    protected void handleTextChanges() {
        this.inputEditText.addTextChangedListener(new C0793c());
    }

    public abstract int layoutResource();

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        l.f(parcelable, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        if (parcelable instanceof C0794a) {
            C0794a c0794a = (C0794a) parcelable;
            super.onRestoreInstanceState(c0794a.getSuperState());
            SparseArray<Parcelable> m37984a = c0794a.m37984a();
            if (m37984a == null) {
                return;
            }
            restoreChildViewStates(this, m37984a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0794a c0794a = new C0794a(super.onSaveInstanceState());
        c0794a.m37983b(saveChildViewStates(this));
        return c0794a;
    }

    public final void setClickedListener(final InterfaceC11767l<? super View, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "action");
        getEditText().setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.edittext.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0790c.m41877setClickedListener$lambda2(InterfaceC11767l.this, view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.edittext.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0790c.m41878setClickedListener$lambda3(InterfaceC11767l.this, view);
            }
        });
    }

    public final void setEditable(boolean z) {
        this.inputEditText.setEnabled(z);
    }

    public void setError(String str) {
        if (this.errorTextView.getVisibility() == 8 && str == null) {
            return;
        }
        this.errorTextView.setVisibility(str != null ? 0 : 8);
        this.hintField.setVisibility(str != null ? 0 : 8);
        this.errorTextView.setText(str);
        this.hintField.setTextColor(C1335a.m36324d(getContext(), str != null ? C0755a.KudiRed : C0755a.kudiInputFieldHintColor));
        if (str != null) {
            ((GradientDrawable) this.shapeDrawable.mutate()).setStroke(2, C1335a.m36324d(getContext(), C0755a.KudiRed));
        }
        this.inputLayout.setBackground(this.shapeDrawable);
    }

    public final void setHint(String str) {
        l.f(str, "hint");
        this.hintField.setText(str);
        this.inputEditText.setHint(str);
        this.hintText = str;
    }

    public final void setHintField(TextView textView) {
        l.f(textView, "<set-?>");
        this.hintField = textView;
    }

    public final void setHintText(String str) {
        this.hintText = str;
    }

    public final void setInputType(int i) {
        this.inputType = i;
    }

    public final void setMaxLength(int i) {
        this.inputEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void setText(String str) {
        this.inputEditText.setText(str);
        this.hintField.setTextColor(C1335a.m36324d(getContext(), C0755a.kudiInputFieldHintColor));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0790c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.maxLength = 40;
        Drawable m36322f = C1335a.m36322f(context, C0756b.shape_rect);
        Drawable mutate = m36322f == null ? null : m36322f.mutate();
        if (mutate != null) {
            this.shapeDrawable = (GradientDrawable) mutate;
            View.inflate(context, layoutResource(), this);
            extractAttributes(context, attributeSet);
            View findViewById = findViewById(C0785d.inputLayout);
            l.e(findViewById, "findViewById(R.id.inputLayout)");
            this.inputLayout = (ViewGroup) findViewById;
            View findViewWithTag = findViewWithTag("inputEditText");
            l.e(findViewWithTag, "findViewWithTag(\"inputEditText\")");
            this.inputEditText = (EditText) findViewWithTag;
            View findViewById2 = findViewById(C0785d.hint);
            l.e(findViewById2, "findViewById(R.id.hint)");
            this.hintField = (TextView) findViewById2;
            this.iconView = (ImageView) findViewById(C0785d.iconView);
            View findViewById3 = findViewById(C0785d.errorField);
            l.e(findViewById3, "findViewById(R.id.errorField)");
            this.errorTextView = (TextView) findViewById3;
            applyAttributes();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }
}
