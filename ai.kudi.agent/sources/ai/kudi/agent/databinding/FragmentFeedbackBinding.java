package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentFeedbackBinding implements InterfaceC8209a {
    public final ImageView imageView12;
    private final ConstraintLayout rootView;
    public final TextView textView21;
    public final TextView textView22;
    public final TextView textView23;

    private FragmentFeedbackBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.imageView12 = imageView;
        this.textView21 = textView;
        this.textView22 = textView2;
        this.textView23 = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFeedbackBinding bind(View view) {
        int $i0 = C0001R.C0003id.imageView12;
        View $r1 = view.findViewById(C0001R.C0003id.imageView12);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.textView21;
            View $r12 = view.findViewById(C0001R.C0003id.textView21);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.textView22;
                View $r13 = view.findViewById(C0001R.C0003id.textView22);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.textView23;
                    View $r14 = view.findViewById(C0001R.C0003id.textView23);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        FragmentFeedbackBinding $r6 = new FragmentFeedbackBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater) {
        FragmentFeedbackBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentFeedbackBinding $r3 = bind($r2);
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
