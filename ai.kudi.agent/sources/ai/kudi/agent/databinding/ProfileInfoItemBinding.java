package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ProfileInfoItemBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final TextView titleText;
    public final TextView valeuText;
    public final View view7;

    private ProfileInfoItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view) {
        this.rootView = constraintLayout;
        this.titleText = textView;
        this.valeuText = textView2;
        this.view7 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProfileInfoItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.title_text;
        View $r1 = view.findViewById(C0001R.C0003id.title_text);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.valeu_text;
            View $r12 = view.findViewById(C0001R.C0003id.valeu_text);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.view7;
                View $r13 = view.findViewById(C0001R.C0003id.view7);
                if ($r13 != null) {
                    ConstraintLayout $r5 = (ConstraintLayout) view;
                    ProfileInfoItemBinding $r4 = new ProfileInfoItemBinding($r5, $r2, $r3, $r13);
                    return $r4;
                }
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
    public static ProfileInfoItemBinding inflate(LayoutInflater layoutInflater) {
        ProfileInfoItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProfileInfoItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.profile_info_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ProfileInfoItemBinding $r3 = bind($r2);
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
