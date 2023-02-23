package p272h.p375g.p376a.p378h;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import p272h.p375g.p376a.C9427c;
import p272h.p375g.p376a.C9430f;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
import p272h.p375g.p376a.p377g.C9431a;
import p577n.p587c.C14460c;
import p577n.p587c.InterfaceC14459b;
/* compiled from: ConfigParser.java */
/* renamed from: h.g.a.h.e */
/* loaded from: classes2.dex */
public class C9436e {

    /* renamed from: a */
    private static final InterfaceC14459b f22103a = C14460c.m1680f(C9436e.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigParser.java */
    /* renamed from: h.g.a.h.e$a */
    /* loaded from: classes2.dex */
    public static class C9437a implements EntityResolver {
        C9437a() {
        }

        @Override // org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
            if (str2.contains("j8583.dtd")) {
                URL resource = C9437a.class.getResource("j8583.dtd");
                if (resource == null) {
                    C9436e.f22103a.mo1640g("Cannot find j8583.dtd in classpath. j8583 config files will not be validated.");
                    return null;
                }
                return new InputSource(resource.toString());
            }
            return null;
        }
    }

    /* renamed from: b */
    public static <T extends C9427c> void m14725b(C9430f<T> c9430f, String str) throws IOException {
        InputStream resourceAsStream = c9430f.getClass().getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            f22103a.mo1641f("ISO8583 Parsing config from classpath file {}", str);
            try {
                m14723d(c9430f, resourceAsStream);
                return;
            } finally {
                resourceAsStream.close();
            }
        }
        f22103a.mo1646a("ISO8583 File not found in classpath: {}", str);
    }

    /* renamed from: c */
    protected static <T extends C9427c> AbstractC9442j m14724c(Element element, C9430f<T> c9430f) throws IOException {
        AbstractC9442j m14714d = AbstractC9442j.m14714d(EnumC9428d.valueOf(element.getAttribute("type")), element.getAttribute("length").length() > 0 ? Integer.parseInt(element.getAttribute("length")) : 0, c9430f.m14753c());
        NodeList elementsByTagName = element.getElementsByTagName("field");
        if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
            C9431a c9431a = new C9431a();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element2 = (Element) elementsByTagName.item(i);
                if (element2.getParentNode() == element) {
                    c9431a.m14733e(m14724c(element2, c9430f));
                }
            }
            m14714d.m14712h(c9431a);
        }
        return m14714d;
    }

    /* renamed from: d */
    protected static <T extends C9427c> void m14723d(C9430f<T> c9430f, InputStream inputStream) throws IOException {
        try {
            DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new C9437a());
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            m14721f(documentElement.getElementsByTagName("header"), c9430f);
            m14720g(documentElement.getElementsByTagName("template"), c9430f);
            m14722e(documentElement.getElementsByTagName("parse"), c9430f);
        } catch (ParserConfigurationException e) {
            f22103a.mo1644c("ISO8583 Cannot parse XML configuration", e);
        } catch (SAXException e2) {
            f22103a.mo1644c("ISO8583 Parsing XML configuration", e2);
        }
    }

    /* renamed from: e */
    protected static <T extends C9427c> void m14722e(NodeList nodeList, C9430f<T> c9430f) throws IOException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            int m14719h = m14719h(element.getAttribute("type"));
            if (m14719h != -1) {
                if (element.getAttribute("extends") != null && !element.getAttribute("extends").isEmpty()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(nodeList.getLength() - i);
                    }
                    arrayList.add(element);
                } else {
                    HashMap hashMap2 = new HashMap();
                    NodeList elementsByTagName = element.getElementsByTagName("field");
                    for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                        Element element2 = (Element) elementsByTagName.item(i2);
                        if (element2.getParentNode() == element) {
                            hashMap2.put(Integer.valueOf(Integer.parseInt(element2.getAttribute("num"))), m14724c(element2, c9430f));
                        }
                    }
                    c9430f.m14740p(m14719h, hashMap2);
                    hashMap.put(Integer.valueOf(m14719h), hashMap2);
                }
            } else {
                throw new IOException("Invalid ISO8583 type for parse guide: " + element.getAttribute("type"));
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                int m14719h2 = m14719h(element3.getAttribute("type"));
                int m14719h3 = m14719h(element3.getAttribute("extends"));
                if (m14719h3 != -1) {
                    HashMap hashMap3 = (HashMap) hashMap.get(Integer.valueOf(m14719h3));
                    if (hashMap3 != null) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.putAll(hashMap3);
                        NodeList elementsByTagName2 = element3.getElementsByTagName("field");
                        for (int i3 = 0; i3 < elementsByTagName2.getLength(); i3++) {
                            Element element4 = (Element) elementsByTagName2.item(i3);
                            int parseInt = Integer.parseInt(element4.getAttribute("num"));
                            if ("exclude".equals(element4.getAttribute("type"))) {
                                hashMap4.remove(Integer.valueOf(parseInt));
                            } else {
                                hashMap4.put(Integer.valueOf(parseInt), m14724c(element4, c9430f));
                            }
                        }
                        c9430f.m14740p(m14719h2, hashMap4);
                    } else {
                        throw new IllegalArgumentException("Parsing guide " + element3.getAttribute("type") + " extends nonexistent guide " + element3.getAttribute("extends"));
                    }
                } else {
                    throw new IllegalArgumentException("Message template " + element3.getAttribute("type") + " extends invalid template " + element3.getAttribute("extends"));
                }
            }
        }
    }

    /* renamed from: f */
    protected static <T extends C9427c> void m14721f(NodeList nodeList, C9430f<T> c9430f) throws IOException {
        ArrayList arrayList = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            int m14719h = m14719h(element.getAttribute("type"));
            if (m14719h != -1) {
                if (element.getChildNodes() != null && element.getChildNodes().getLength() != 0) {
                    String nodeValue = element.getChildNodes().item(0).getNodeValue();
                    if (f22103a.mo1642e()) {
                        f22103a.mo1643d("Adding ISO8583 header for type {}: {}", element.getAttribute("type"), nodeValue);
                    }
                    c9430f.m14741o(m14719h, nodeValue);
                } else if (element.getAttribute("ref") != null && !element.getAttribute("ref").isEmpty()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(nodeList.getLength() - i);
                    }
                    arrayList.add(element);
                } else {
                    throw new IOException("Invalid ISO8583 header element");
                }
            } else {
                throw new IOException("Invalid type for ISO8583 header: " + element.getAttribute("type"));
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Element element2 = (Element) it.next();
                int m14719h2 = m14719h(element2.getAttribute("type"));
                if (m14719h2 != -1) {
                    if (element2.getAttribute("ref") != null && !element2.getAttribute("ref").isEmpty()) {
                        int m14719h3 = m14719h(element2.getAttribute("ref"));
                        if (m14719h3 != -1) {
                            String m14750f = c9430f.m14750f(m14719h3);
                            if (m14750f != null) {
                                if (f22103a.mo1642e()) {
                                    f22103a.mo1639h("Adding ISO8583 header for type {}: {} (copied from {})", element2.getAttribute("type"), m14750f, element2.getAttribute("ref"));
                                }
                                c9430f.m14741o(m14719h2, m14750f);
                            } else {
                                throw new IllegalArgumentException("Header def " + m14719h2 + " refers to nonexistent header " + m14719h3);
                            }
                        } else {
                            throw new IOException("Invalid type reference " + element2.getAttribute("ref") + " for ISO8583 header " + m14719h2);
                        }
                    }
                } else {
                    throw new IOException("Invalid type for ISO8583 header: " + element2.getAttribute("type"));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [h.g.a.b] */
    /* JADX WARN: Type inference failed for: r21v0, types: [h.g.a.f<T extends h.g.a.c>, h.g.a.f] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* renamed from: g */
    protected static <T extends C9427c> void m14720g(NodeList nodeList, C9430f<T> c9430f) throws IOException {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i >= nodeList.getLength()) {
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Element element = (Element) it.next();
                        int m14719h = m14719h(element.getAttribute("type"));
                        int m14719h2 = m14719h(element.getAttribute("extends"));
                        if (m14719h2 != i2) {
                            C9427c m14749g = c9430f.m14749g(m14719h2);
                            if (m14749g != null) {
                                C9427c c9427c = new C9427c();
                                c9427c.m14772j(m14719h);
                                c9427c.m14774h(c9430f.m14753c());
                                for (int i3 = 2; i3 < 128; i3++) {
                                    if (m14749g.m14777e(i3)) {
                                        c9427c.m14773i(i3, m14749g.m14780b(i3).clone());
                                    }
                                }
                                NodeList elementsByTagName = element.getElementsByTagName("field");
                                for (int i4 = 0; i4 < elementsByTagName.getLength(); i4++) {
                                    Element element2 = (Element) elementsByTagName.item(i4);
                                    int parseInt = Integer.parseInt(element2.getAttribute("num"));
                                    String attribute = element2.getAttribute("type");
                                    if ("exclude".equals(attribute)) {
                                        c9427c.m14773i(parseInt, null);
                                    } else {
                                        EnumC9428d valueOf = EnumC9428d.valueOf(attribute);
                                        int parseInt2 = element2.getAttribute("length").length() > 0 ? Integer.parseInt(element2.getAttribute("length")) : 0;
                                        String nodeValue = element2.getChildNodes().item(0).getNodeValue();
                                        InterfaceC9426b m14752d = c9430f.m14752d(parseInt);
                                        String str = nodeValue;
                                        if (m14752d != null) {
                                            str = m14752d.mo14737a(nodeValue);
                                        }
                                        c9427c.m14771k(parseInt, str, m14752d, valueOf, parseInt2);
                                    }
                                }
                                c9430f.m14755a(c9427c);
                                i2 = -1;
                            } else {
                                throw new IllegalArgumentException("Message template " + element.getAttribute("type") + " extends nonexistent template " + element.getAttribute("extends"));
                            }
                        } else {
                            throw new IllegalArgumentException("Message template " + element.getAttribute("type") + " extends invalid template " + element.getAttribute("extends"));
                        }
                    }
                    return;
                }
                return;
            }
            Element element3 = (Element) nodeList.item(i);
            int m14719h3 = m14719h(element3.getAttribute("type"));
            if (m14719h3 != -1) {
                if (element3.getAttribute("extends") != null && !element3.getAttribute("extends").isEmpty()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(nodeList.getLength() - i);
                    }
                    arrayList.add(element3);
                } else {
                    C9427c c9427c2 = new C9427c();
                    c9427c2.m14772j(m14719h3);
                    c9427c2.m14774h(c9430f.m14753c());
                    NodeList elementsByTagName2 = element3.getElementsByTagName("field");
                    for (int i5 = 0; i5 < elementsByTagName2.getLength(); i5++) {
                        Element element4 = (Element) elementsByTagName2.item(i5);
                        int parseInt3 = Integer.parseInt(element4.getAttribute("num"));
                        EnumC9428d valueOf2 = EnumC9428d.valueOf(element4.getAttribute("type"));
                        int parseInt4 = element4.getAttribute("length").length() > 0 ? Integer.parseInt(element4.getAttribute("length")) : 0;
                        ?? nodeValue2 = element4.getChildNodes().item(0).getNodeValue();
                        ?? m14752d2 = c9430f.m14752d(parseInt3);
                        if (m14752d2 != 0) {
                            nodeValue2 = m14752d2.mo14737a(nodeValue2);
                        }
                        c9427c2.m14771k(parseInt3, nodeValue2, m14752d2, valueOf2, parseInt4);
                    }
                    c9430f.m14755a(c9427c2);
                }
                i++;
            } else {
                throw new IOException("Invalid ISO8583 type for template: " + element3.getAttribute("type"));
            }
        }
    }

    /* renamed from: h */
    private static int m14719h(String str) throws IOException {
        if (str.length() % 2 == 1) {
            str = "0" + str;
        }
        if (str.length() != 4) {
            return -1;
        }
        return (str.charAt(3) - '0') | ((str.charAt(0) - '0') << 12) | ((str.charAt(1) - '0') << 8) | ((str.charAt(2) - '0') << 4);
    }
}
