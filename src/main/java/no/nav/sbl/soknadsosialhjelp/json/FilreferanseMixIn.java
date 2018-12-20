package no.nav.sbl.soknadsosialhjelp.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import no.nav.sbl.soknadsosialhjelp.innsyn.soker.filreferanse.JsonDokumentlagerFilreferanse;
import no.nav.sbl.soknadsosialhjelp.innsyn.soker.filreferanse.JsonSvarUtFilreferanse;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = JsonSvarUtFilreferanse.class, name = "svarUt"),
    @JsonSubTypes.Type(value = JsonDokumentlagerFilreferanse.class, name = "dokumentlager")
})
public interface FilreferanseMixIn {}