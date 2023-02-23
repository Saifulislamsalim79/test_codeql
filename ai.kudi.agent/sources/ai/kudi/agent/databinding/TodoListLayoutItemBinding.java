package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TodoListLayoutItemBinding implements InterfaceC8209a {
    private final CardView rootView;
    public final View todoIndicator;
    public final AppCompatTextView todoTextView;

    private TodoListLayoutItemBinding(CardView cardView, View view, AppCompatTextView appCompatTextView) {
        this.rootView = cardView;
        this.todoIndicator = view;
        this.todoTextView = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TodoListLayoutItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.todoIndicator;
        View $r1 = view.findViewById(C0001R.C0003id.todoIndicator);
        if ($r1 != null) {
            $i0 = C0001R.C0003id.todoTextView;
            View $r2 = view.findViewById(C0001R.C0003id.todoTextView);
            AppCompatTextView $r3 = (AppCompatTextView) $r2;
            if ($r3 != null) {
                CardView $r5 = (CardView) view;
                TodoListLayoutItemBinding $r4 = new TodoListLayoutItemBinding($r5, $r1, $r3);
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
    public static TodoListLayoutItemBinding inflate(LayoutInflater layoutInflater) {
        TodoListLayoutItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TodoListLayoutItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.todo_list_layout_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TodoListLayoutItemBinding $r3 = bind($r2);
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
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}
