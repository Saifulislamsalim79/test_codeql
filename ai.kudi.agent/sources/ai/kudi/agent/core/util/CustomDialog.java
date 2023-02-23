package ai.kudi.agent.core.util;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.ForceKycUpgradeViewBinding;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import kotlin.p549l0.C13276s;
import p201g.p227h.p235j.p236g.C7667a;
/* compiled from: CustomDialog.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/util/CustomDialog;", "", "()V", "ClickListeners", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CustomDialog {
    public static final Companion Companion;

    /* compiled from: CustomDialog.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/util/CustomDialog$ClickListeners;", "", "onActionButtonClick", "", "onBackButtonClick", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface ClickListeners {
        void onActionButtonClick();

        void onBackButtonClick();
    }

    /* compiled from: CustomDialog.kt */
    @Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J_\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0001\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0013JP\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0007J<\u0010\u0003\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019JR\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001e\u001a\u00020\u0006JT\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0007¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/core/util/CustomDialog$Companion;", "", "()V", "show", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", KudiPin.KUDI_PIN_TITLE, "", "titleDrawableRes", "", MetricTracker.Object.MESSAGE, "buttonText", "cancelable", "", "buttonAction", "Lkotlin/Function0;", "", "layoutId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;I)Landroid/app/Dialog;", "shouldButtonTextBeUpperCase", "dismissOnAction", "icon", "Landroid/graphics/drawable/Drawable;", "callback", "Lai/kudi/agent/core/util/CustomDialog$ClickListeners;", "positiveButtonText", "negativeButtonText", "positiveCallback", "negativeCallback", "activity", "showConfirmDialog", "onOkayButton", "onCancel", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Dialog show$default(Companion companion, Context context, String str, Integer num, String str2, String str3, boolean $z0, InterfaceC11756a interfaceC11756a, int i, int i2, Object obj) {
            int $i1 = i2 & 32;
            if ($i1 != 0) {
                $z0 = false;
            }
            Dialog $r8 = companion.show(context, str, num, str2, str3, $z0, interfaceC11756a, i);
            return $r8;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Dialog show$default(Companion companion, Context context, String str, String str2, boolean $z0, boolean $z1, boolean $z2, InterfaceC11756a interfaceC11756a, int i, Object obj) {
            int $i1 = i & 8;
            if ($i1 != 0) {
                $z0 = true;
            }
            int $i12 = i & 16;
            if ($i12 != 0) {
                $z1 = false;
            }
            int $i0 = i & 32;
            if ($i0 != 0) {
                $z2 = true;
            }
            Dialog $r6 = companion.show(context, str, str2, $z0, $z1, $z2, interfaceC11756a);
            return $r6;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void show$default(Companion companion, String str, String str2, String $r3, String $r4, InterfaceC11756a interfaceC11756a, InterfaceC11756a interfaceC11756a2, Context context, int i, Object obj) {
            int $i1 = i & 4;
            if ($i1 != 0) {
                $r3 = "Ok";
            }
            int $i12 = i & 8;
            if ($i12 != 0) {
                $r4 = "Cancel";
            }
            int $i13 = i & 16;
            int $i0 = i & 32;
            InterfaceC11756a $r5 = $i13 != 0 ? CustomDialog$Companion$show$3.INSTANCE : interfaceC11756a;
            InterfaceC11756a $r6 = $i0 != 0 ? CustomDialog$Companion$show$4.INSTANCE : interfaceC11756a2;
            companion.show(str, str2, $r3, $r4, $r5, $r6, context);
        }

        /* renamed from: show$lambda-2 */
        public static final void m39172show$lambda2(DialogInterfaceC0936d dialogInterfaceC0936d, ClickListeners clickListeners, View view) {
            Log_OC.getArray(dialogInterfaceC0936d, "$dialog");
            dialogInterfaceC0936d.dismiss();
            if (clickListeners == null) {
                return;
            }
            clickListeners.onActionButtonClick();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: show$lambda-3 */
        public static final boolean m39173show$lambda3(DialogInterfaceC0936d dialogInterfaceC0936d, ClickListeners clickListeners, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            Log_OC.getArray(dialogInterfaceC0936d, "$dialog");
            if (i == 4) {
                DialogInterfaceC0936d r4 = dialogInterfaceC0936d;
                boolean $z0 = r4.isShowing();
                if (!$z0 || clickListeners == null) {
                    return true;
                }
                clickListeners.onBackButtonClick();
                return true;
            }
            return true;
        }

        /* renamed from: show$lambda-4 */
        public static final void m39174show$lambda4(InterfaceC11756a interfaceC11756a, DialogInterface dialogInterface, int i) {
            Log_OC.getArray(interfaceC11756a, "$positiveCallback");
            interfaceC11756a.invoke();
        }

        /* renamed from: show$lambda-5 */
        public static final void m39175show$lambda5(InterfaceC11756a interfaceC11756a, DialogInterface dialogInterface, int i) {
            Log_OC.getArray(interfaceC11756a, "$negativeCallback");
            dialogInterface.cancel();
            interfaceC11756a.invoke();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: show$lambda-6 */
        public static final void m39176show$lambda6(InterfaceC11756a interfaceC11756a, boolean z, C11812w c11812w, View view) {
            Log_OC.getArray(c11812w, "$dialog");
            if (interfaceC11756a != null) {
                interfaceC11756a.invoke();
            }
            if (z || interfaceC11756a == null) {
                Object $r3 = c11812w.f26499c;
                Dialog $r4 = (Dialog) $r3;
                if ($r4 == null) {
                    return;
                }
                $r4.dismiss();
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: show$lambda-8 */
        public static final void m39177show$lambda8(InterfaceC11756a interfaceC11756a, C11812w c11812w, View view) {
            Log_OC.getArray(c11812w, "$dialog");
            if (interfaceC11756a != null) {
                interfaceC11756a.invoke();
                return;
            }
            Object $r3 = c11812w.f26499c;
            Dialog $r4 = (Dialog) $r3;
            if ($r4 == null) {
                return;
            }
            $r4.dismiss();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Dialog showConfirmDialog$default(Companion companion, Context context, String str, String str2, String str3, boolean $z0, InterfaceC11756a interfaceC11756a, InterfaceC11756a $r6, int i, Object obj) {
            int $i1 = i & 16;
            if ($i1 != 0) {
                $z0 = true;
            }
            int $i0 = i & 64;
            if ($i0 != 0) {
                $r6 = null;
            }
            Dialog $r8 = companion.showConfirmDialog(context, str, str2, str3, $z0, interfaceC11756a, $r6);
            return $r8;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: showConfirmDialog$lambda-10 */
        public static final void m39178showConfirmDialog$lambda10(C11812w c11812w, InterfaceC11756a interfaceC11756a, View view) {
            Log_OC.getArray(c11812w, "$dialog");
            Object $r3 = c11812w.f26499c;
            Dialog $r4 = (Dialog) $r3;
            if ($r4 != null) {
                $r4.dismiss();
            }
            if (interfaceC11756a == null) {
                return;
            }
            interfaceC11756a.invoke();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: showConfirmDialog$lambda-9 */
        public static final void m39179showConfirmDialog$lambda9(C11812w c11812w, InterfaceC11756a interfaceC11756a, View view) {
            Log_OC.getArray(c11812w, "$dialog");
            Log_OC.getArray(interfaceC11756a, "$onOkayButton");
            Object $r3 = c11812w.f26499c;
            Dialog $r4 = (Dialog) $r3;
            if ($r4 != null) {
                $r4.dismiss();
            }
            interfaceC11756a.invoke();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Type inference failed for: r34v0, types: [T, androidx.appcompat.app.d] */
        public final Dialog show(Context context, String str, Integer num, String str2, String str3, boolean z, final InterfaceC11756a interfaceC11756a, int i) {
            String $r2;
            String $r22;
            Log_OC.getArray(context, "context");
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, MetricTracker.Object.MESSAGE);
            Log_OC.getArray(str3, "buttonText");
            final C11812w r25 = new C11812w();
            LayoutInflater $r8 = LayoutInflater.from(context);
            View $r9 = $r8.inflate(i, (ViewGroup) null);
            DialogInterfaceC0936d.C0937a r26 = new DialogInterfaceC0936d.C0937a(context);
            r26.setView($r9);
            int $i0 = C0038R.C0040id.title;
            View $r11 = $r9.findViewById($i0);
            TextView $r12 = (TextView) $r11;
            int $i02 = C0038R.C0040id.body;
            View $r112 = $r9.findViewById($i02);
            TextView $r13 = (TextView) $r112;
            int $i03 = C0038R.C0040id.action;
            TextView $r14 = (TextView) $r9.findViewById($i03);
            $r12.setText(str);
            if (num != null) {
                int $i04 = num.intValue();
                $r12.setCompoundDrawablesWithIntrinsicBounds($i04, 0, 0, 0);
            }
            Spanned $r15 = Html.fromHtml(str2);
            $r13.setText($r15);
            Pattern $r16 = Pattern.compile("\\d{9}", 2);
            Linkify.addLinks($r13, 15);
            C7667a.m17881b($r13, $r16, "tel://", null, null, null);
            int $i05 = str3.length();
            if ($i05 > 0) {
                StringBuilder r27 = new StringBuilder();
                char $c1 = str3.charAt(0);
                boolean $z1 = Character.isLowerCase($c1);
                if ($z1) {
                    Locale $r18 = Locale.getDefault();
                    Log_OC.loadImage($r18, "getDefault()");
                    $r22 = C13252b.m5546d($c1, $r18);
                } else {
                    $r22 = String.valueOf($c1);
                }
                r27.append($r22.toString());
                String $r23 = str3.substring(1);
                Log_OC.loadImage($r23, "(this as java.lang.String).substring(startIndex)");
                r27.append($r23);
                $r2 = r27.toString();
            } else {
                $r2 = str3;
            }
            $r14.setText($r2);
            $r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.core.util.e
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11756a $r24 = InterfaceC11756a.this;
                    C11812w $r3 = r25;
                    CustomDialog.Companion.m39177show$lambda8($r24, $r3, view);
                }
            });
            r26.setCancelable(z);
            ?? create = r26.create();
            r25.f26499c = create;
            Dialog $r20 = (DialogInterfaceC0936d) create;
            Dialog $r24 = $r20;
            $r24.requestWindowFeature(1);
            Object $r21 = r25.f26499c;
            Dialog $r202 = (DialogInterfaceC0936d) $r21;
            Dialog $r242 = $r202;
            Window $r222 = $r242.getWindow();
            if ($r222 != null) {
                ColorDrawable r29 = new ColorDrawable(0);
                $r222.setBackgroundDrawable(r29);
            }
            Object $r212 = r25.f26499c;
            Dialog $r203 = (DialogInterfaceC0936d) $r212;
            Dialog $r243 = $r203;
            $r243.show();
            Object $r213 = r25.f26499c;
            Dialog $r244 = (Dialog) $r213;
            return $r244;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Type inference failed for: r21v0, types: [T, androidx.appcompat.app.d] */
        public final Dialog show(Context context, String str, String str2, boolean z, boolean z2, final boolean z3, final InterfaceC11756a interfaceC11756a) {
            String $r4;
            Log_OC.getArray(context, "context");
            Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
            Log_OC.getArray(str2, "buttonText");
            final C11812w r19 = new C11812w();
            LayoutInflater $r6 = LayoutInflater.from(context);
            int $i0 = C0038R.C0041layout.content_referral_response;
            View $r7 = $r6.inflate($i0, (ViewGroup) null);
            DialogInterfaceC0936d.C0937a r20 = new DialogInterfaceC0936d.C0937a(context);
            r20.setView($r7);
            int $i02 = C0038R.C0040id.title;
            View $r9 = $r7.findViewById($i02);
            TextView $r10 = (TextView) $r9;
            int $i03 = C0038R.C0040id.action;
            KudiButton $r11 = (KudiButton) $r7.findViewById($i03);
            $r10.setText(str);
            if (z) {
                Locale $r12 = Locale.ROOT;
                String $r3 = str2.toUpperCase($r12);
                $r4 = $r3;
                Log_OC.loadImage($r3, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
            } else {
                $r4 = C13276s.m5446o(str2);
            }
            $r11.setText($r4);
            KudiButton r23 = $r11;
            r23.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.core.util.g
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11756a $r2 = InterfaceC11756a.this;
                    boolean $z0 = z3;
                    C11812w $r32 = r19;
                    CustomDialog.Companion.m39176show$lambda6($r2, $z0, $r32, view);
                }
            });
            r20.setCancelable(z2);
            ?? create = r20.create();
            r19.f26499c = create;
            Dialog $r14 = (DialogInterfaceC0936d) create;
            Dialog $r18 = $r14;
            $r18.requestWindowFeature(1);
            Object $r15 = r19.f26499c;
            Dialog $r142 = (DialogInterfaceC0936d) $r15;
            Dialog $r182 = $r142;
            Window $r16 = $r182.getWindow();
            if ($r16 != null) {
                ColorDrawable r22 = new ColorDrawable(0);
                $r16.setBackgroundDrawable(r22);
            }
            Object $r152 = r19.f26499c;
            Dialog $r143 = (DialogInterfaceC0936d) $r152;
            Dialog $r183 = $r143;
            $r183.show();
            Object $r153 = r19.f26499c;
            Dialog $r184 = (Dialog) $r153;
            return $r184;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void show(Drawable drawable, String str, String str2, String str3, Context context, final ClickListeners clickListeners) {
            Log_OC.getArray(str2, MetricTracker.Object.MESSAGE);
            Log_OC.getArray(str3, "buttonText");
            Log_OC.getArray(context, "context");
            LayoutInflater $r7 = LayoutInflater.from(context);
            ForceKycUpgradeViewBinding $r8 = ForceKycUpgradeViewBinding.inflate($r7, null, false);
            Log_OC.loadImage($r8, "inflate(LayoutInflater.from(context), null, false)");
            TextView $r9 = $r8.message;
            $r9.setText(str2);
            if (str == null) {
                TextView $r92 = $r8.title;
                Log_OC.loadImage($r92, "binding.title");
                ViewExtKt.hide$default($r92, false, 1, null);
            } else {
                TextView $r93 = $r8.title;
                $r93.setText(str);
            }
            KudiButton $r10 = $r8.button;
            $r10.setText(str3);
            ImageView $r11 = $r8.icon;
            $r11.setImageDrawable(drawable);
            DialogInterfaceC0936d.C0937a r19 = new DialogInterfaceC0936d.C0937a(context);
            r19.setCancelable(false);
            View $r13 = $r8.getRoot();
            View r22 = $r13;
            r19.setView(r22);
            final DialogInterfaceC0936d $r14 = r19.create();
            DialogInterfaceC0936d r23 = $r14;
            Window $r15 = r23.getWindow();
            Log_OC.append($r15);
            WindowManager.LayoutParams $r16 = $r15.getAttributes();
            int $i0 = C0038R.style.DialogAnimation;
            $r16.windowAnimations = $i0;
            DialogInterfaceC0936d r232 = $r14;
            Window $r152 = r232.getWindow();
            Log_OC.append($r152);
            int $i02 = C0038R.C0039drawable.ic_white_rect;
            Drawable $r4 = C1335a.m36322f(context, $i02);
            $r152.setBackgroundDrawable($r4);
            Log_OC.loadImage($r14, "Builder(context).apply {\n                setCancelable(false)\n                setView(binding.root)\n            }.create().apply {\n                window!!.attributes.windowAnimations = R.style.DialogAnimation\n                window!!.setBackgroundDrawable(\n                    ContextCompat.getDrawable(context, R.drawable.ic_white_rect)\n                )\n            }");
            ViewGroup $r102 = $r8.button;
            ViewGroup r24 = $r102;
            r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.core.util.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogInterfaceC0936d $r2 = DialogInterfaceC0936d.this;
                    CustomDialog.ClickListeners $r3 = clickListeners;
                    CustomDialog.Companion.m39172show$lambda2($r2, $r3, view);
                }
            });
            DialogInterfaceC0936d r233 = $r14;
            r233.show();
            DialogInterfaceC0936d r234 = $r14;
            r234.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ai.kudi.agent.core.util.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    DialogInterfaceC0936d $r2 = DialogInterfaceC0936d.this;
                    CustomDialog.ClickListeners $r3 = clickListeners;
                    boolean $z0 = CustomDialog.Companion.m39173show$lambda3($r2, $r3, dialogInterface, i, keyEvent);
                    return $z0;
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void show(String str, String str2, String str3, String str4, final InterfaceC11756a interfaceC11756a, final InterfaceC11756a interfaceC11756a2, Context context) {
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, MetricTracker.Object.MESSAGE);
            Log_OC.getArray(str3, "positiveButtonText");
            Log_OC.getArray(str4, "negativeButtonText");
            Log_OC.getArray(interfaceC11756a, "positiveCallback");
            Log_OC.getArray(interfaceC11756a2, "negativeCallback");
            Log_OC.getArray(context, "activity");
            int $i0 = C0038R.style.AlertDialogTheme;
            DialogInterfaceC0936d.C0937a $r8 = new DialogInterfaceC0936d.C0937a(context, $i0);
            $r8.setTitle(str);
            $r8.setMessage(str2);
            $r8.setCancelable(false);
            $r8.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.core.util.Credits$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterfaceC11756a $r2 = InterfaceC11756a.this;
                    CustomDialog.Companion.m39174show$lambda4($r2, dialogInterface, i);
                }
            });
            $r8.setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.core.util.ChangelogDialog$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterfaceC11756a $r2 = InterfaceC11756a.this;
                    CustomDialog.Companion.m39175show$lambda5($r2, dialogInterface, i);
                }
            });
            $r8.show();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Type inference failed for: r24v0, types: [T, androidx.appcompat.app.d] */
        public final Dialog showConfirmDialog(Context context, String str, String str2, String str3, boolean z, final InterfaceC11756a interfaceC11756a, final InterfaceC11756a interfaceC11756a2) {
            String $r5;
            Log_OC.getArray(context, "context");
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, MetricTracker.Object.MESSAGE);
            Log_OC.getArray(str3, "buttonText");
            Log_OC.getArray(interfaceC11756a, "onOkayButton");
            final C11812w r23 = new C11812w();
            LayoutInflater $r8 = LayoutInflater.from(context);
            int $i0 = C0038R.C0041layout.content_confirm_dialog;
            View $r9 = $r8.inflate($i0, (ViewGroup) null);
            DialogInterfaceC0936d.C0937a r24 = new DialogInterfaceC0936d.C0937a(context);
            r24.setView($r9);
            int $i02 = C0038R.C0040id.title;
            View $r11 = $r9.findViewById($i02);
            TextView $r12 = (TextView) $r11;
            int $i03 = C0038R.C0040id.body;
            View $r112 = $r9.findViewById($i03);
            TextView $r13 = (TextView) $r112;
            int $i04 = C0038R.C0040id.okay_button;
            View $r113 = $r9.findViewById($i04);
            KudiButton $r14 = (KudiButton) $r113;
            int $i05 = C0038R.C0040id.cancel_button;
            Button $r15 = (Button) $r9.findViewById($i05);
            $r12.setText(str);
            $r13.setText(str2);
            $r5 = C13276s.m5446o(str3);
            $r14.setText($r5);
            KudiButton r28 = $r14;
            r28.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.core.util.TimePicker$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11812w $r2 = C11812w.this;
                    InterfaceC11756a $r3 = interfaceC11756a;
                    CustomDialog.Companion.m39179showConfirmDialog$lambda9($r2, $r3, view);
                }
            });
            $r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.core.util.a
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11812w $r2 = C11812w.this;
                    InterfaceC11756a $r3 = interfaceC11756a2;
                    CustomDialog.Companion.m39178showConfirmDialog$lambda10($r2, $r3, view);
                }
            });
            r24.setCancelable(z);
            ?? create = r24.create();
            r23.f26499c = create;
            Dialog $r18 = (DialogInterfaceC0936d) create;
            Dialog $r22 = $r18;
            $r22.requestWindowFeature(1);
            Object $r19 = r23.f26499c;
            Dialog $r182 = (DialogInterfaceC0936d) $r19;
            Dialog $r222 = $r182;
            Window $r20 = $r222.getWindow();
            if ($r20 != null) {
                ColorDrawable r27 = new ColorDrawable(0);
                $r20.setBackgroundDrawable(r27);
            }
            Object $r192 = r23.f26499c;
            Dialog $r183 = (DialogInterfaceC0936d) $r192;
            Dialog $r223 = $r183;
            $r223.show();
            Object $r193 = r23.f26499c;
            Dialog $r224 = (Dialog) $r193;
            return $r224;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }
}
