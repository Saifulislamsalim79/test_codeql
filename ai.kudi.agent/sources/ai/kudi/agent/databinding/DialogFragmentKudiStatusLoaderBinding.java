package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class DialogFragmentKudiStatusLoaderBinding implements InterfaceC8209a {
    public final ConstraintLayout container;
    public final ProgressBar pbLoader;
    private final ConstraintLayout rootView;
    public final TextView tvMsg;

    private DialogFragmentKudiStatusLoaderBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, TextView textView) {
        this.rootView = constraintLayout;
        this.container = constraintLayout2;
        this.pbLoader = progressBar;
        this.tvMsg = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DialogFragmentKudiStatusLoaderBinding bind(View view) {
        ConstraintLayout $r1 = (ConstraintLayout) view;
        int $i0 = C0001R.C0003id.pb_loader;
        View $r2 = view.findViewById(C0001R.C0003id.pb_loader);
        ProgressBar $r3 = (ProgressBar) $r2;
        if ($r3 != null) {
            $i0 = C0001R.C0003id.tv_msg;
            View $r22 = view.findViewById(C0001R.C0003id.tv_msg);
            TextView $r4 = (TextView) $r22;
            if ($r4 != null) {
                DialogFragmentKudiStatusLoaderBinding $r5 = new DialogFragmentKudiStatusLoaderBinding($r1, $r1, $r3, $r4);
                return $r5;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DialogFragmentKudiStatusLoaderBinding inflate(LayoutInflater layoutInflater) {
        DialogFragmentKudiStatusLoaderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DialogFragmentKudiStatusLoaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.dialog_fragment_kudi_status_loader, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        DialogFragmentKudiStatusLoaderBinding $r3 = bind($r2);
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
