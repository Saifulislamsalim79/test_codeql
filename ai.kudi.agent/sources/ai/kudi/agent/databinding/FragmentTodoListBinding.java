package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTodoListBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final RecyclerView todoListRv;
    public final TextView todoListSubtitleView;
    public final TextView todoListTitleView;

    private FragmentTodoListBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.todoListRv = recyclerView;
        this.todoListSubtitleView = textView;
        this.todoListTitleView = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTodoListBinding bind(View view) {
        int $i0 = C0001R.C0003id.todoListRv;
        View $r1 = view.findViewById(C0001R.C0003id.todoListRv);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.todoListSubtitleView;
            View $r12 = view.findViewById(C0001R.C0003id.todoListSubtitleView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.todoListTitleView;
                View $r13 = view.findViewById(C0001R.C0003id.todoListTitleView);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentTodoListBinding $r5 = new FragmentTodoListBinding($r6, $r2, $r3, $r4);
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
    public static FragmentTodoListBinding inflate(LayoutInflater layoutInflater) {
        FragmentTodoListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTodoListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_todo_list, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTodoListBinding $r3 = bind($r2);
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
