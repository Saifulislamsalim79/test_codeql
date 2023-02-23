package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ProfileInfoViewBinding implements InterfaceC8209a {
    public final TextView editProfile;
    public final TextView profileCompletionTextView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextView textView17;
    public final View view6;

    private ProfileInfoViewBinding(LinearLayout linearLayout, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, View view) {
        this.rootView = linearLayout;
        this.editProfile = textView;
        this.profileCompletionTextView = textView2;
        this.recyclerView = recyclerView;
        this.textView17 = textView3;
        this.view6 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProfileInfoViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.editProfile;
        View $r1 = view.findViewById(C0001R.C0003id.editProfile);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.profileCompletionTextView;
            View $r12 = view.findViewById(C0001R.C0003id.profileCompletionTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.recyclerView;
                View $r13 = view.findViewById(C0001R.C0003id.recyclerView);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.textView17;
                    View $r14 = view.findViewById(C0001R.C0003id.textView17);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.view6;
                        View $r15 = view.findViewById(C0001R.C0003id.view6);
                        if ($r15 != null) {
                            ProfileInfoViewBinding $r6 = new ProfileInfoViewBinding((LinearLayout) view, $r2, $r3, $r4, textView, $r15);
                            return $r6;
                        }
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
    public static ProfileInfoViewBinding inflate(LayoutInflater layoutInflater) {
        ProfileInfoViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProfileInfoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.profile_info_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ProfileInfoViewBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
