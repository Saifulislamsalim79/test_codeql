package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPosActivationNotificationReceiverBinding implements InterfaceC8209a {
    public final ImageView cancelButton;
    public final KudiButton getStartedButton;
    public final ImageView imageView15;
    public final TextView learnMoreTextView;
    private final ScrollView rootView;
    public final KudiTextView textView29;
    public final KudiTextView textView48;
    public final KudiTextView textView50;

    private FragmentPosActivationNotificationReceiverBinding(ScrollView scrollView, ImageView imageView, KudiButton kudiButton, ImageView imageView2, TextView textView, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiTextView kudiTextView3) {
        this.rootView = scrollView;
        this.cancelButton = imageView;
        this.getStartedButton = kudiButton;
        this.imageView15 = imageView2;
        this.learnMoreTextView = textView;
        this.textView29 = kudiTextView;
        this.textView48 = kudiTextView2;
        this.textView50 = kudiTextView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosActivationNotificationReceiverBinding bind(View view) {
        int $i0 = C0001R.C0003id.cancelButton;
        View $r1 = view.findViewById(C0001R.C0003id.cancelButton);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.get_started_button;
            View $r12 = view.findViewById(C0001R.C0003id.get_started_button);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.imageView15;
                View $r13 = view.findViewById(C0001R.C0003id.imageView15);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.learn_more_text_view;
                    View $r14 = view.findViewById(C0001R.C0003id.learn_more_text_view);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.textView29;
                        View $r15 = view.findViewById(C0001R.C0003id.textView29);
                        KudiTextView kudiTextView = (KudiTextView) $r15;
                        if (kudiTextView != null) {
                            $i0 = C0001R.C0003id.textView48;
                            View $r16 = view.findViewById(C0001R.C0003id.textView48);
                            KudiTextView kudiTextView2 = (KudiTextView) $r16;
                            if (kudiTextView2 != null) {
                                $i0 = C0001R.C0003id.textView50;
                                View $r17 = view.findViewById(C0001R.C0003id.textView50);
                                KudiTextView $r8 = (KudiTextView) $r17;
                                if ($r8 != null) {
                                    ScrollView $r10 = (ScrollView) view;
                                    FragmentPosActivationNotificationReceiverBinding $r9 = new FragmentPosActivationNotificationReceiverBinding($r10, $r2, $r3, imageView, textView, kudiTextView, kudiTextView2, $r8);
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
    public static FragmentPosActivationNotificationReceiverBinding inflate(LayoutInflater layoutInflater) {
        FragmentPosActivationNotificationReceiverBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosActivationNotificationReceiverBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pos_activation_notification_receiver, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPosActivationNotificationReceiverBinding $r3 = bind($r2);
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
