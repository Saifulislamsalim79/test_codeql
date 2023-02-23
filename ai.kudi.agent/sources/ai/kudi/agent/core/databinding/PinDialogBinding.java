package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class PinDialogBinding implements InterfaceC8209a {
    public final ImageView close;
    public final TextView errorTextView;
    public final PinEntryView inputForm;
    public final PinpadView keypad;
    public final KudiTextView pinDesc;
    public final KudiTextView pinTitle;
    public final ProgressBar progressBar;
    private final ScrollView rootView;
    public final View view;

    private PinDialogBinding(ScrollView scrollView, ImageView imageView, TextView textView, PinEntryView pinEntryView, PinpadView pinpadView, KudiTextView kudiTextView, KudiTextView kudiTextView2, ProgressBar progressBar, View view) {
        this.rootView = scrollView;
        this.close = imageView;
        this.errorTextView = textView;
        this.inputForm = pinEntryView;
        this.keypad = pinpadView;
        this.pinDesc = kudiTextView;
        this.pinTitle = kudiTextView2;
        this.progressBar = progressBar;
        this.view = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PinDialogBinding bind(View view) {
        View $r1;
        int $i0 = C0038R.C0040id.close;
        View $r12 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r12;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.errorTextView;
            View $r13 = view.findViewById($i0);
            TextView $r3 = (TextView) $r13;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.inputForm;
                View $r14 = view.findViewById($i0);
                PinEntryView pinEntryView = (PinEntryView) $r14;
                if (pinEntryView != null) {
                    $i0 = C0038R.C0040id.keypad;
                    View $r15 = view.findViewById($i0);
                    PinpadView pinpadView = (PinpadView) $r15;
                    if (pinpadView != null) {
                        $i0 = C0038R.C0040id.pinDesc;
                        View $r16 = view.findViewById($i0);
                        KudiTextView kudiTextView = (KudiTextView) $r16;
                        if (kudiTextView != null) {
                            $i0 = C0038R.C0040id.pinTitle;
                            View $r17 = view.findViewById($i0);
                            KudiTextView kudiTextView2 = (KudiTextView) $r17;
                            if (kudiTextView2 != null) {
                                $i0 = C0038R.C0040id.progressBar;
                                View $r18 = view.findViewById($i0);
                                ProgressBar $r8 = (ProgressBar) $r18;
                                if ($r8 != null && ($r1 = view.findViewById(($i0 = C0038R.C0040id.view))) != null) {
                                    ScrollView $r10 = (ScrollView) view;
                                    PinDialogBinding $r9 = new PinDialogBinding($r10, $r2, $r3, pinEntryView, pinpadView, kudiTextView, kudiTextView2, $r8, $r1);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PinDialogBinding inflate(LayoutInflater layoutInflater) {
        PinDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PinDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.pin_dialog;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        PinDialogBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
