package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAboutKycBinding implements InterfaceC8209a {
    public final TextView descriptionText;
    public final ProgressBar loadingIndicator;
    public final RecyclerView mRecyclerView;
    private final NestedScrollView rootView;

    private FragmentAboutKycBinding(NestedScrollView nestedScrollView, TextView textView, ProgressBar progressBar, RecyclerView recyclerView) {
        this.rootView = nestedScrollView;
        this.descriptionText = textView;
        this.loadingIndicator = progressBar;
        this.mRecyclerView = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAboutKycBinding bind(View view) {
        int $i0 = C0001R.C0003id.descriptionText;
        View $r1 = view.findViewById(C0001R.C0003id.descriptionText);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.loadingIndicator;
            View $r12 = view.findViewById(C0001R.C0003id.loadingIndicator);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.f3rv;
                View $r13 = view.findViewById(C0001R.C0003id.f3rv);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    NestedScrollView $r6 = (NestedScrollView) view;
                    FragmentAboutKycBinding $r5 = new FragmentAboutKycBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAboutKycBinding inflate(LayoutInflater layoutInflater) {
        FragmentAboutKycBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAboutKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_about_kyc, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAboutKycBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
