package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSavingSuccessBinding implements InterfaceC8209a {
    public final AppCompatImageButton closeButton;
    public final KudiButton closeButton1;
    public final ImageView ivSuccess;
    private final ConstraintLayout rootView;
    public final TextView tvSuccess;
    public final TextView tvSuccessMessage;

    private FragmentSavingSuccessBinding(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, KudiButton kudiButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.closeButton = appCompatImageButton;
        this.closeButton1 = kudiButton;
        this.ivSuccess = imageView;
        this.tvSuccess = textView;
        this.tvSuccessMessage = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingSuccessBinding bind(View view) {
        int $i0 = C0456R.C0458id.close_button;
        View $r1 = view.findViewById($i0);
        AppCompatImageButton $r2 = (AppCompatImageButton) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.closeButton;
            View $r12 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.ivSuccess;
                View $r13 = view.findViewById($i0);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0456R.C0458id.tvSuccess;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0456R.C0458id.tvSuccessMessage;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            FragmentSavingSuccessBinding $r7 = new FragmentSavingSuccessBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, textView2);
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
    public static FragmentSavingSuccessBinding inflate(LayoutInflater layoutInflater) {
        FragmentSavingSuccessBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_saving_success;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSavingSuccessBinding $r3 = bind($r2);
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
