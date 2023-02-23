package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentAnnouncementPopBinding implements InterfaceC8209a {
    public final TextView action;
    public final View background;
    public final TextView body;
    public final View divider1;
    public final View divider2;
    private final CardView rootView;
    public final TextView title;

    private ContentAnnouncementPopBinding(CardView cardView, TextView textView, View view, TextView textView2, View view2, View view3, TextView textView3) {
        this.rootView = cardView;
        this.action = textView;
        this.background = view;
        this.body = textView2;
        this.divider1 = view2;
        this.divider2 = view3;
        this.title = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAnnouncementPopBinding bind(View view) {
        int $i0 = C0001R.C0003id.action;
        TextView $r2 = (TextView) view.findViewById(C0001R.C0003id.action);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.background;
            View $r1 = view.findViewById(C0001R.C0003id.background);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.body;
                TextView $r4 = (TextView) view.findViewById(C0001R.C0003id.body);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.divider1;
                    View $r3 = view.findViewById(C0001R.C0003id.divider1);
                    if ($r3 != null) {
                        $i0 = C0001R.C0003id.divider2;
                        View $r5 = view.findViewById(C0001R.C0003id.divider2);
                        if ($r5 != null) {
                            $i0 = C0001R.C0003id.title;
                            View $r6 = view.findViewById(C0001R.C0003id.title);
                            TextView textView = (TextView) $r6;
                            if (textView != null) {
                                ContentAnnouncementPopBinding $r8 = new ContentAnnouncementPopBinding((CardView) view, $r2, $r1, $r4, $r3, $r5, textView);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAnnouncementPopBinding inflate(LayoutInflater layoutInflater) {
        ContentAnnouncementPopBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAnnouncementPopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.content_announcement_pop, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentAnnouncementPopBinding $r3 = bind($r2);
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
