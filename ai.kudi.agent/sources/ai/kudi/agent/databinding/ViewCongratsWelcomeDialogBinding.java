package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewCongratsWelcomeDialogBinding implements InterfaceC8209a {
    public final Button continueButton;
    public final TextView fundWallet;
    private final ConstraintLayout rootView;
    public final ImageView welcomeImage;
    public final TextView welcomeMessage;
    public final TextView welcomeName;

    private ViewCongratsWelcomeDialogBinding(ConstraintLayout constraintLayout, Button button, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.continueButton = button;
        this.fundWallet = textView;
        this.welcomeImage = imageView;
        this.welcomeMessage = textView2;
        this.welcomeName = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewCongratsWelcomeDialogBinding bind(View view) {
        int $i0 = C0001R.C0003id.continueButton;
        View $r1 = view.findViewById(C0001R.C0003id.continueButton);
        Button $r2 = (Button) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.fund_wallet;
            View $r12 = view.findViewById(C0001R.C0003id.fund_wallet);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.welcome_image;
                View $r13 = view.findViewById(C0001R.C0003id.welcome_image);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.welcome_message;
                    View $r14 = view.findViewById(C0001R.C0003id.welcome_message);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.welcome_name;
                        View $r15 = view.findViewById(C0001R.C0003id.welcome_name);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            ViewCongratsWelcomeDialogBinding $r7 = new ViewCongratsWelcomeDialogBinding($r8, $r2, $r3, $r4, textView, textView2);
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
    public static ViewCongratsWelcomeDialogBinding inflate(LayoutInflater layoutInflater) {
        ViewCongratsWelcomeDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewCongratsWelcomeDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_congrats_welcome_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewCongratsWelcomeDialogBinding $r3 = bind($r2);
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
