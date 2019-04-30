package org.taktik.icure.services.external.rest.v1.dto;

import org.taktik.icure.services.external.rest.v1.dto.embed.AddressDto;

import java.util.List;

public class MedicalLocationDto extends StoredDto {
    protected String name;
    protected String description;
    protected AddressDto address;
    protected String responsible;
    protected List<String> agendaIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public List<String> getAgendaIds() { return agendaIds; }

    public void setAgendaIds(List<String> agendaIds) { this.agendaIds = agendaIds; }
}
