package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class AppVersionDialogBinding implements InterfaceC8209a {
    public final TextView appVersionText;
    public final ImageView backButton;
    public final TextView buildNumber;
    public final TextView copyRightTextView;
    public final ImageView imageView12;
    private final ConstraintLayout rootView;
    public final TextView textView30;

    private AppVersionDialogBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4) {
        this.rootView = constraintLayout;
        this.appVersionText = textView;
        this.backButton = imageView;
        this.buildNumber = textView2;
        this.copyRightTextView = textView3;
        this.imageView12 = imageView2;
        this.textView30 = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppVersionDialogBinding bind(View view) {
        int $i0 = C0214R.C0216id.app_version_text;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.back_button;
            View $r12 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.buildNumber;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.copy_right_text_view;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0214R.C0216id.imageView12;
                        View $r15 = view.findViewById($i0);
                        ImageView imageView = (ImageView) $r15;
                        if (imageView != null) {
                            $i0 = C0214R.C0216id.textView30;
                            View $r16 = view.findViewById($i0);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                AppVersionDialogBinding $r8 = new AppVersionDialogBinding($r9, $r2, $r3, $r4, textView, imageView, textView2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppVersionDialogBinding inflate(LayoutInflater layoutInflater) {
        AppVersionDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppVersionDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.app_version_dialog;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        AppVersionDialogBinding $r3 = bind($r2);
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
