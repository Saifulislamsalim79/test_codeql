package androidx.core.content.p057e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ComplexColorCompat.java */
/* renamed from: androidx.core.content.e.b */
/* loaded from: classes2.dex */
public final class C1346b {

    /* renamed from: a */
    private final Shader f4187a;

    /* renamed from: b */
    private final ColorStateList f4188b;

    /* renamed from: c */
    private int f4189c;

    private C1346b(Shader shader, ColorStateList colorStateList, int i) {
        this.f4187a = shader;
        this.f4188b = colorStateList;
        this.f4189c = i;
    }

    /* renamed from: a */
    private static C1346b m36287a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c != 0) {
                if (c == 1) {
                    return m36284d(C1352d.m36255b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m36285c(C1345a.m36294b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1346b m36286b(int i) {
        return new C1346b(null, null, i);
    }

    /* renamed from: c */
    static C1346b m36285c(ColorStateList colorStateList) {
        return new C1346b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C1346b m36284d(Shader shader) {
        return new C1346b(shader, null, 0);
    }

    /* renamed from: g */
    public static C1346b m36281g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m36287a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int m36283e() {
        return this.f4189c;
    }

    /* renamed from: f */
    public Shader m36282f() {
        return this.f4187a;
    }

    /* renamed from: h */
    public boolean m36280h() {
        return this.f4187a != null;
    }

    /* renamed from: i */
    public boolean m36279i() {
        ColorStateList colorStateList;
        return this.f4187a == null && (colorStateList = this.f4188b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m36278j(int[] iArr) {
        if (m36279i()) {
            ColorStateList colorStateList = this.f4188b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4189c) {
                this.f4189c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m36277k(int i) {
        this.f4189c = i;
    }

    /* renamed from: l */
    public boolean m36276l() {
        return m36280h() || this.f4189c != 0;
    }
}
