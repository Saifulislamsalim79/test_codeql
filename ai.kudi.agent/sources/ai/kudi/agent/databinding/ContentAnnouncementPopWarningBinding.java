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
public final class ContentAnnouncementPopWarningBinding implements InterfaceC8209a {
    public final TextView action;
    public final View background;
    public final TextView body;
    public final View divider2;
    private final CardView rootView;
    public final TextView title;

    private ContentAnnouncementPopWarningBinding(CardView cardView, TextView textView, View view, TextView textView2, View view2, TextView textView3) {
        this.rootView = cardView;
        this.action = textView;
        this.background = view;
        this.body = textView2;
        this.divider2 = view2;
        this.title = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAnnouncementPopWarningBinding bind(View view) {
        int $i0 = C0001R.C0003id.action;
        TextView $r2 = (TextView) view.findViewById(C0001R.C0003id.action);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.background;
            View $r1 = view.findViewById(C0001R.C0003id.background);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.body;
                TextView $r4 = (TextView) view.findViewById(C0001R.C0003id.body);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.divider2;
                    View $r3 = view.findViewById(C0001R.C0003id.divider2);
                    if ($r3 != null) {
                        $i0 = C0001R.C0003id.title;
                        View $r5 = view.findViewById(C0001R.C0003id.title);
                        TextView textView = (TextView) $r5;
                        if (textView != null) {
                            ContentAnnouncementPopWarningBinding $r7 = new ContentAnnouncementPopWarningBinding((CardView) view, $r2, $r1, $r4, $r3, textView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAnnouncementPopWarningBinding inflate(LayoutInflater layoutInflater) {
        ContentAnnouncementPopWarningBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAnnouncementPopWarningBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.content_announcement_pop_warning, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentAnnouncementPopWarningBinding $r3 = bind($r2);
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
