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
public final class ContactsListItemBinding implements InterfaceC8209a {
    public final TextView indexTextView;
    public final TextView inviteAction;
    public final TextView name;
    public final TextView phoneNumberTextView;
    private final ConstraintLayout rootView;

    private ContactsListItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.indexTextView = textView;
        this.inviteAction = textView2;
        this.name = textView3;
        this.phoneNumberTextView = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContactsListItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.indexTextView;
        View $r1 = view.findViewById(C0001R.C0003id.indexTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.inviteAction;
            View $r12 = view.findViewById(C0001R.C0003id.inviteAction);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.name;
                View $r13 = view.findViewById(C0001R.C0003id.name);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.phoneNumberTextView;
                    View $r14 = view.findViewById(C0001R.C0003id.phoneNumberTextView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        ContactsListItemBinding $r6 = new ContactsListItemBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static ContactsListItemBinding inflate(LayoutInflater layoutInflater) {
        ContactsListItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContactsListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.contacts_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContactsListItemBinding $r3 = bind($r2);
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
