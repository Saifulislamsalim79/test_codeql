package ai.kudi.agent.custom.views.pinentryview;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* compiled from: PinEntryView.kt */
@Metadata(m10422d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0004efghB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\b\u0010@\u001a\u00020=H\u0003J\u0006\u0010A\u001a\u00020=J\n\u0010B\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020,H\u0016J\b\u0010E\u001a\u00020=H\u0016J\u001a\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J0\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0014J\u0018\u0010P\u001a\u00020=2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0014J\b\u0010S\u001a\u00020=H\u0016J\u0010\u0010T\u001a\u00020=2\u0006\u0010U\u001a\u00020VH\u0014J\n\u0010W\u001a\u0004\u0018\u00010VH\u0014J\u0010\u0010X\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020YH\u0016J\u000e\u0010Z\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u000e\u0010[\u001a\u00020=2\u0006\u0010\\\u001a\u00020\u000eJ\u000e\u0010]\u001a\u00020=2\u0006\u0010^\u001a\u00020\u000eJ\u0010\u0010_\u001a\u00020=2\u0006\u0010`\u001a\u00020\bH\u0016J\u0010\u0010a\u001a\u00020=2\u0006\u0010L\u001a\u000201H\u0016J\u000e\u0010b\u001a\u00020=2\u0006\u00108\u001a\u00020cJ\b\u0010d\u001a\u00020\u000eH\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001c\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\fR\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\fR\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\fR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\fR\"\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006i"}, m10421d2 = {"Lai/kudi/agent/custom/views/pinentryview/PinEntryView;", "Landroid/view/ViewGroup;", "Lai/kudi/dip/library/keypad/PinpadView$ViewProvider;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accentColor", "getAccentColor", "()I", "accentRequiresFocus", "", "getAccentRequiresFocus", "()Z", "accentType", "getAccentType", "accentWidth", "getAccentWidth", "digitBackground", "getDigitBackground", "<set-?>", "digitElevation", "getDigitElevation", "digitHeight", "getDigitHeight", "digitSpacing", "getDigitSpacing", "digitTextColor", "getDigitTextColor", "digitTextSize", "getDigitTextSize", "digitView", "Lai/kudi/agent/custom/views/pinentryview/PinEntryView$DigitView;", "digitWidth", "getDigitWidth", "digits", "getDigits", "editText", "Landroid/widget/EditText;", "inputType", "getInputType", "", "mask", "getMask", "()Ljava/lang/String;", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "onPinEnteredListener", "Lai/kudi/agent/custom/views/pinentryview/PinEntryView$OnPinEnteredListener;", "getOnPinEnteredListener", "()Lai/kudi/agent/custom/views/pinentryview/PinEntryView$OnPinEnteredListener;", "setOnPinEnteredListener", "(Lai/kudi/agent/custom/views/pinentryview/PinEntryView$OnPinEnteredListener;)V", AttributeType.TEXT, "Landroid/text/Editable;", "getText", "()Landroid/text/Editable;", "addTextChangedListener", "", "watcher", "Landroid/text/TextWatcher;", "addViews", "clearText", "getOnFocusChangeListener", "onAppendChar", "s", "onDeleteChar", "onKeyUp", "keyCode", "event", "Landroid/view/KeyEvent;", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onReset", "onRestoreInstanceState", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "onTouchEvent", "Landroid/view/MotionEvent;", "removeTextChangedListener", "setBorder", "isError", "setEditable", "isEditable", "setNumDigits", "numDigits", "setOnFocusChangeListener", "setText", "", "shouldDelayChildPressedState", "Companion", "DigitView", "OnPinEnteredListener", "SavedState", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PinEntryView extends ViewGroup implements PinpadView.InterfaceC0836d {
    public static final int ACCENT_ALL = 1;
    public static final int ACCENT_CHARACTER = 2;
    public static final int ACCENT_NONE = 0;
    public static final Companion Companion;
    private final int accentColor;
    private final boolean accentRequiresFocus;
    private final int accentType;
    private final int accentWidth;
    private final int digitBackground;
    private int digitElevation;
    private final int digitHeight;
    private final int digitSpacing;
    private final int digitTextColor;
    private final int digitTextSize;
    private DigitView digitView;
    private final int digitWidth;
    private final int digits;
    private EditText editText;
    private final int inputType;
    private String mask;
    private View.OnFocusChangeListener onFocusChangeListener;
    private OnPinEnteredListener onPinEnteredListener;

    /* compiled from: PinEntryView.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/custom/views/pinentryview/PinEntryView$Companion;", "", "()V", "ACCENT_ALL", "", "ACCENT_CHARACTER", "ACCENT_NONE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PinEntryView.kt */
    @Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/custom/views/pinentryview/PinEntryView$DigitView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Lai/kudi/agent/custom/views/pinentryview/PinEntryView;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class DigitView extends AppCompatTextView {
        private final Paint paint;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DigitView(PinEntryView pinEntryView, Context context) {
            this(context, null, 0, 6, null);
            Log_OC.getArray(pinEntryView, "this$0");
            Log_OC.getArray(context, "context");
            PinEntryView.this = pinEntryView;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DigitView(PinEntryView pinEntryView, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
            Log_OC.getArray(pinEntryView, "this$0");
            Log_OC.getArray(context, "context");
            PinEntryView.this = pinEntryView;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public DigitView(PinEntryView pinEntryView, Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Log_OC.getArray(pinEntryView, "this$0");
            Log_OC.getArray(context, "context");
            PinEntryView.this = pinEntryView;
            Paint $r4 = new Paint();
            this.paint = $r4;
            Paint.Style $r5 = Paint.Style.FILL;
            $r4.setStyle($r5);
            Paint $r42 = this.paint;
            PinEntryView $r2 = PinEntryView.this;
            int $i0 = $r2.getAccentColor();
            $r42.setColor($i0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ DigitView(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
            /*
                r1 = this;
                ai.kudi.agent.custom.views.pinentryview.PinEntryView.this = r2
                r0 = r6 & 2
                if (r0 == 0) goto L7
                r4 = 0
            L7:
                r6 = r6 & 4
                if (r6 == 0) goto Lc
                r5 = 0
            Lc:
                r1.<init>(r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.custom.views.pinentryview.PinEntryView.DigitView.<init>(ai.kudi.agent.custom.views.pinentryview.PinEntryView, android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            Log_OC.getArray(canvas, "canvas");
            DigitView r2 = this;
            super.onDraw(canvas);
            DigitView r22 = this;
            r22.postInvalidateDelayed(500L);
        }
    }

    /* compiled from: PinEntryView.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/custom/views/pinentryview/PinEntryView$OnPinEnteredListener;", "", "onPinEntered", "", "pin", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface OnPinEnteredListener {
        void onPinEntered(String str);
    }

    /* compiled from: PinEntryView.kt */
    @Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/custom/views/pinentryview/PinEntryView$SavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", TransactionField.TRANSACTION_CHANNEL, "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "editTextValue", "", "getEditTextValue", "()Ljava/lang/String;", "setEditTextValue", "(Ljava/lang/String;)V", "writeToParcel", "", "dest", "flags", "", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        public static final Companion Companion;
        public String editTextValue;

        /* compiled from: PinEntryView.kt */
        @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/custom/views/pinentryview/PinEntryView$SavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lai/kudi/agent/custom/views/pinentryview/PinEntryView$SavedState;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
                this();
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Companion $r0 = new Companion(null);
            Companion = $r0;
            CREATOR = new Parcelable.Creator<SavedState>() { // from class: ai.kudi.agent.custom.views.pinentryview.PinEntryView$SavedState$Companion$CREATOR$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PinEntryView.SavedState createFromParcel(Parcel parcel) {
                    Log_OC.getArray(parcel, "in");
                    PinEntryView.SavedState $r2 = new PinEntryView.SavedState(parcel, null);
                    return $r2;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ PinEntryView.SavedState createFromParcel(Parcel parcel) {
                    PinEntryView.SavedState $r1 = createFromParcel(parcel);
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PinEntryView.SavedState[] newArray(int i) {
                    PinEntryView.SavedState[] $r1 = new PinEntryView.SavedState[0];
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ PinEntryView.SavedState[] newArray(int i) {
                    PinEntryView.SavedState[] $r1 = newArray(i);
                    return $r1;
                }
            };
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SavedState(Parcel parcel) {
            super(parcel);
            String $r1 = parcel.readString();
            String $r3 = $r1;
            setEditTextValue($r1 == null ? "" : $r3);
        }

        public /* synthetic */ SavedState(Parcel parcel, DBUtils$1 dBUtils$1) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getEditTextValue() {
            String $r1 = this.editTextValue;
            if ($r1 != null) {
                return $r1;
            }
            Log_OC.LogError("editTextValue");
            NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
            throw r2;
        }

        public final void setEditTextValue(String str) {
            Log_OC.getArray(str, "<set-?>");
            this.editTextValue = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "dest");
            super.writeToParcel(parcel, i);
            String $r2 = getEditTextValue();
            parcel.writeString($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinEntryView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PinEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int $i1;
        int $i12;
        Log_OC.getArray(context, "context");
        this.mask = "*";
        Context $r1 = getContext();
        int[] $r3 = C0038R.styleable.PinEntryView;
        TypedArray $r4 = $r1.obtainStyledAttributes(attributeSet, $r3);
        Log_OC.loadImage($r4, "getContext().obtainStyledAttributes(attrs, R.styleable.PinEntryView)");
        int $i0 = C0038R.styleable.PinEntryView_numDigits;
        this.digits = $r4.getInt($i0, 4);
        int $i02 = C0038R.styleable.PinEntryView_pinInputType;
        this.inputType = $r4.getInt($i02, 2);
        int $i03 = C0038R.styleable.PinEntryView_accentType;
        this.accentType = $r4.getInt($i03, 2);
        Resources $r5 = getResources();
        DisplayMetrics $r6 = $r5.getDisplayMetrics();
        int $i04 = C0038R.styleable.PinEntryView_digitWidth;
        float $f0 = TypedValue.applyDimension(1, 50.0f, $r6);
        int $i13 = (int) $f0;
        this.digitWidth = $r4.getDimensionPixelSize($i04, $i13);
        int $i05 = C0038R.styleable.PinEntryView_digitHeight;
        float $f02 = TypedValue.applyDimension(1, 50.0f, $r6);
        int $i14 = (int) $f02;
        this.digitHeight = $r4.getDimensionPixelSize($i05, $i14);
        int $i06 = C0038R.styleable.PinEntryView_digitSpacing;
        float $f03 = TypedValue.applyDimension(1, 20.0f, $r6);
        int $i15 = (int) $f03;
        this.digitSpacing = $r4.getDimensionPixelSize($i06, $i15);
        int $i07 = C0038R.styleable.PinEntryView_digitTextSize;
        float $f04 = TypedValue.applyDimension(2, 15.0f, $r6);
        int $i16 = (int) $f04;
        this.digitTextSize = $r4.getDimensionPixelSize($i07, $i16);
        int $i08 = C0038R.styleable.PinEntryView_accentWidth;
        float $f05 = TypedValue.applyDimension(1, 2.0f, $r6);
        int $i17 = (int) $f05;
        this.accentWidth = $r4.getDimensionPixelSize($i08, $i17);
        int $i09 = Build.VERSION.SDK_INT;
        if ($i09 >= 21) {
            int $i010 = C0038R.styleable.PinEntryView_digitElevation;
            this.digitElevation = $r4.getDimensionPixelSize($i010, 0);
        }
        Context $r12 = getContext();
        Resources.Theme $r7 = $r12.getTheme();
        TypedValue $r8 = new TypedValue();
        $r7.resolveAttribute(16842836, $r8, true);
        int $i011 = C0038R.styleable.PinEntryView_digitBackground;
        int $i18 = $r8.resourceId;
        this.digitBackground = $r4.getResourceId($i011, $i18);
        TypedValue $r82 = new TypedValue();
        $r7.resolveAttribute(16842806, $r82, true);
        int $i012 = C0038R.styleable.PinEntryView_digitTextColor;
        int $i19 = $r82.resourceId;
        if ($i19 > 0) {
            Resources $r52 = getResources();
            int $i110 = $r82.resourceId;
            $i1 = $r52.getColor($i110);
        } else {
            $i1 = $r82.data;
        }
        this.digitTextColor = $r4.getColor($i012, $i1);
        TypedValue $r83 = new TypedValue();
        int $i013 = C0038R.attr.colorAccent;
        $r7.resolveAttribute($i013, $r83, true);
        int $i014 = C0038R.styleable.PinEntryView_pinAccentColor;
        int $i111 = $r83.resourceId;
        if ($i111 > 0) {
            Resources $r53 = getResources();
            int $i112 = $r83.resourceId;
            $i12 = $r53.getColor($i112);
        } else {
            $i12 = $r83.data;
        }
        this.accentColor = $r4.getColor($i014, $i12);
        int $i015 = C0038R.styleable.PinEntryView_mask;
        String $r9 = $r4.getString($i015);
        if ($r9 != null) {
            this.mask = $r9;
        }
        int $i016 = C0038R.styleable.PinEntryView_accentRequiresFocus;
        boolean $z0 = $r4.getBoolean($i016, true);
        this.accentRequiresFocus = $z0;
        $r4.recycle();
        addViews();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PinEntryView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r4 = 0
        La:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.custom.views.pinentryview.PinEntryView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0248, code lost:
        if (r7 == r0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025c A[LOOP:1: B:46:0x021a->B:62:0x025c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025f A[EDGE_INSN: B:74:0x025f->B:63:0x025f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addViews() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.custom.views.pinentryview.PinEntryView.addViews():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addViews$lambda-0  reason: not valid java name */
    public static final void m39192addViews$lambda0(PinEntryView pinEntryView, int i, View view, boolean z) {
        Log_OC.getArray(pinEntryView, "this$0");
        EditText $r2 = pinEntryView.editText;
        Log_OC.append($r2);
        $r2.setSelection(i);
        View.OnFocusChangeListener $r3 = pinEntryView.onFocusChangeListener;
        if ($r3 != null) {
            Log_OC.append($r3);
            $r3.onFocusChange(pinEntryView, z);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addTextChangedListener(TextWatcher textWatcher) {
        Log_OC.getArray(textWatcher, "watcher");
        EditText $r2 = this.editText;
        Log_OC.append($r2);
        $r2.addTextChangedListener(textWatcher);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clearText() {
        EditText $r1 = this.editText;
        Log_OC.append($r1);
        $r1.setText("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getAccentColor() {
        int i0 = this.accentColor;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getAccentRequiresFocus() {
        boolean z0 = this.accentRequiresFocus;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getAccentType() {
        int i0 = this.accentType;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getAccentWidth() {
        int i0 = this.accentWidth;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitBackground() {
        int i0 = this.digitBackground;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitElevation() {
        int i0 = this.digitElevation;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitHeight() {
        int i0 = this.digitHeight;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitSpacing() {
        int i0 = this.digitSpacing;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitTextColor() {
        int i0 = this.digitTextColor;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitTextSize() {
        int i0 = this.digitTextSize;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigitWidth() {
        int i0 = this.digitWidth;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDigits() {
        int i0 = this.digits;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getInputType() {
        int i0 = this.inputType;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getMask() {
        String r1 = this.mask;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        View.OnFocusChangeListener r1 = this.onFocusChangeListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OnPinEnteredListener getOnPinEnteredListener() {
        OnPinEnteredListener r1 = this.onPinEnteredListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Editable getText() {
        EditText $r2 = this.editText;
        Log_OC.append($r2);
        Editable $r1 = $r2.getText();
        Log_OC.loadImage($r1, "editText!!.text");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
    public void onAppendChar(String str) {
        Log_OC.getArray(str, "s");
        EditText $r2 = this.editText;
        if ($r2 == null) {
            return;
        }
        $r2.append(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
    public void onDeleteChar() {
        EditText $r1;
        int $i0;
        setBorder(false);
        EditText $r12 = this.editText;
        Editable $r3 = $r12 == null ? null : $r12.getText();
        int $i02 = String.valueOf($r3).length();
        boolean $z0 = $i02 > 0;
        if (!$z0 || ($r1 = this.editText) == null) {
            return;
        }
        Editable $r2 = $r1 != null ? $r1.getText() : null;
        String $r4 = String.valueOf($r2);
        Editable $r22 = getText();
        $i0 = C13277t.m5410Q($r22);
        if ($r4 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r5;
        }
        String $r42 = $r4.substring(0, $i0);
        Log_OC.loadImage($r42, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Editable $r23 = StringExtKt.toEditable($r42);
        $r1.setText($r23);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setBorder(false);
            return true;
        }
        boolean $z0 = super.onKeyUp(i, keyEvent);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int $i0 = this.digits;
        if ($i0 > 0) {
            int $i2 = 0;
            while (true) {
                int $i1 = $i2 + 1;
                View $r1 = getChildAt($i2);
                int $i3 = this.digitWidth;
                int $i4 = ($i3 * $i2) + ($i2 > 0 ? $i2 * this.digitSpacing : 0);
                int $i22 = getPaddingLeft();
                int $i32 = this.digitElevation;
                int $i23 = $i22 + $i4 + $i32;
                int $i33 = getPaddingTop();
                int $i5 = this.digitElevation;
                int $i34 = $i33 + ($i5 / 2);
                int $i52 = getPaddingLeft();
                int $i42 = $i4 + $i52;
                int $i53 = this.digitElevation;
                int $i43 = $i42 + $i53;
                int $i54 = this.digitWidth;
                int $i44 = $i43 + $i54;
                int $i55 = getPaddingTop();
                int $i6 = this.digitElevation;
                int $i56 = $i55 + ($i6 / 2);
                int $i62 = this.digitHeight;
                $r1.layout($i23, $i34, $i44, $i56 + $i62);
                if ($i1 >= $i0) {
                    break;
                }
                $i2 = $i1;
            }
        }
        View $r12 = getChildAt(this.digits);
        $r12.layout(0, 0, 1, getMeasuredHeight());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int $i1 = this.digitWidth;
        int $i0 = this.digits;
        int $i2 = this.digitSpacing;
        int $i12 = ($i1 * $i0) + ($i2 * ($i0 - 1));
        int $i22 = getPaddingRight();
        int $i02 = getPaddingLeft() + $i12 + $i22;
        int $i23 = this.digitElevation;
        int $i03 = $i02 + ($i23 * 2);
        int $i24 = this.digitHeight;
        int $i3 = getPaddingTop();
        int $i25 = $i24 + $i3;
        int $i32 = getPaddingBottom();
        int $i26 = $i25 + $i32;
        int $i33 = this.digitElevation;
        setMeasuredDimension($i03, $i26 + ($i33 * 2));
        int $i27 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int $i34 = getChildCount();
        if ($i34 <= 0) {
            return;
        }
        int $i4 = 0;
        while (true) {
            int $i04 = $i4 + 1;
            View $r1 = getChildAt($i4);
            $r1.measure($i12, $i27);
            if ($i04 >= $i34) {
                return;
            }
            $i4 = $i04;
        }
    }

    public void onReset() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Log_OC.getArray(parcelable, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        SavedState $r2 = (SavedState) parcelable;
        Parcelable $r1 = $r2.getSuperState();
        super.onRestoreInstanceState($r1);
        EditText $r3 = this.editText;
        Log_OC.append($r3);
        String $r4 = $r2.getEditTextValue();
        $r3.setText($r4);
        EditText $r32 = this.editText;
        Log_OC.append($r32);
        String $r42 = $r2.getEditTextValue();
        int $i0 = $r42.length();
        $r32.setSelection($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable $r2 = super.onSaveInstanceState();
        SavedState $r1 = new SavedState($r2);
        EditText $r3 = this.editText;
        Log_OC.append($r3);
        Editable $r4 = $r3.getText();
        String $r5 = $r4.toString();
        $r1.setEditTextValue($r5);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
        int $i0 = motionEvent.getAction();
        if ($i0 != 0) {
            boolean $z0 = super.onTouchEvent(motionEvent);
            return $z0;
        }
        EditText $r2 = this.editText;
        Log_OC.append($r2);
        $r2.requestFocus();
        Context $r3 = getContext();
        Object $r4 = $r3.getSystemService("input_method");
        if ($r4 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            throw $r6;
        }
        InputMethodManager $r5 = (InputMethodManager) $r4;
        $r5.showSoftInput(this.editText, 0);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        Log_OC.getArray(textWatcher, "watcher");
        EditText $r2 = this.editText;
        Log_OC.append($r2);
        $r2.removeTextChangedListener(textWatcher);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setBorder(boolean z) {
        Context $r1 = getContext();
        int $i0 = this.digitBackground;
        Drawable $r2 = C1335a.m36322f($r1, $i0);
        Drawable $r22 = $r2 == null ? null : $r2.mutate();
        if ($r22 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            throw $r5;
        }
        GradientDrawable $r3 = (GradientDrawable) $r22;
        if (z) {
            $r3.setStroke(1, -65536);
        } else {
            Context $r12 = getContext();
            int $i02 = C0038R.color.textInputColor;
            $r3.setStroke(1, C1335a.m36324d($r12, $i02));
        }
        int $i03 = 0;
        int $i1 = this.digits;
        if ($i1 <= 0) {
            return;
        }
        while (true) {
            int $i2 = $i03 + 1;
            View $r4 = getChildAt($i03);
            $r4.setBackground($r3);
            if ($i2 >= $i1) {
                return;
            }
            $i03 = $i2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setEditable(boolean z) {
        EditText $r1 = this.editText;
        if ($r1 != null) {
            $r1.setEnabled(z);
        }
        EditText $r12 = this.editText;
        if ($r12 != null) {
            $r12.setFocusable(z);
        }
        EditText $r13 = this.editText;
        if ($r13 == null) {
            return;
        }
        $r13.setFocusableInTouchMode(z);
    }

    public void setNumDigits(int i) {
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        Log_OC.getArray(onFocusChangeListener, "l");
        this.onFocusChangeListener = onFocusChangeListener;
    }

    public final void setOnPinEnteredListener(OnPinEnteredListener onPinEnteredListener) {
        this.onPinEnteredListener = onPinEnteredListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setText(CharSequence $r1) {
        Log_OC.getArray($r1, AttributeType.TEXT);
        int $i1 = $r1.length();
        int $i0 = this.digits;
        if ($i1 > $i0) {
            $r1 = $r1.subSequence(0, $i0);
        }
        EditText $r2 = this.editText;
        Log_OC.append($r2);
        $r2.setText($r1);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
