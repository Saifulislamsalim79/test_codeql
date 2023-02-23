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
public final class HelpContentListBinding implements InterfaceC8209a {
    public final ImageView receiveCallTextView;
    private final ConstraintLayout rootView;
    public final TextView titleTextView;

    private HelpContentListBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.receiveCallTextView = imageView;
        this.titleTextView = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HelpContentListBinding bind(View view) {
        int $i0 = C0001R.C0003id.receive_call_text_view;
        View $r1 = view.findViewById(C0001R.C0003id.receive_call_text_view);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.title_text_view;
            View $r12 = view.findViewById(C0001R.C0003id.title_text_view);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                HelpContentListBinding $r4 = new HelpContentListBinding($r5, $r2, $r3);
                return $r4;
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
    public static HelpContentListBinding inflate(LayoutInflater layoutInflater) {
        HelpContentListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HelpContentListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.help_content_list, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        HelpContentListBinding $r3 = bind($r2);
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
