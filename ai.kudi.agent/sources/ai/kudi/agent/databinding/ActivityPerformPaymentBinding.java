package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityPerformPaymentBinding implements InterfaceC8209a {
    public final ImageView cancelImageView;
    public final ViewLoaderBinding loaderView;
    public final KudiButton nextButton;
    private final ConstraintLayout rootView;
    public final ImageView statusImageView;
    public final TextView statusTextView;

    private ActivityPerformPaymentBinding(ConstraintLayout constraintLayout, ImageView imageView, ViewLoaderBinding viewLoaderBinding, KudiButton kudiButton, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.cancelImageView = imageView;
        this.loaderView = viewLoaderBinding;
        this.nextButton = kudiButton;
        this.statusImageView = imageView2;
        this.statusTextView = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPerformPaymentBinding bind(View view) {
        int $i0 = C0001R.C0003id.cancelImageView;
        ImageView $r2 = (ImageView) view.findViewById(C0001R.C0003id.cancelImageView);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.loaderView;
            View $r1 = view.findViewById(C0001R.C0003id.loaderView);
            if ($r1 != null) {
                ViewLoaderBinding $r3 = ViewLoaderBinding.bind($r1);
                $i0 = C0001R.C0003id.nextButton;
                KudiButton $r4 = (KudiButton) view.findViewById(C0001R.C0003id.nextButton);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.statusImageView;
                    ImageView imageView = (ImageView) view.findViewById(C0001R.C0003id.statusImageView);
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.statusTextView;
                        TextView textView = (TextView) view.findViewById(C0001R.C0003id.statusTextView);
                        if (textView != null) {
                            ActivityPerformPaymentBinding $r7 = new ActivityPerformPaymentBinding((ConstraintLayout) view, $r2, $r3, $r4, imageView, textView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPerformPaymentBinding inflate(LayoutInflater layoutInflater) {
        ActivityPerformPaymentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPerformPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_perform_payment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityPerformPaymentBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
