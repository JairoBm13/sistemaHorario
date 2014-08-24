/* ========================================================================
 * Copyright 2014 preGrupo8
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 preGrupo8

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.preGrupo8.seccion.master.persistence.entity;

import co.edu.uniandes.csw.preGrupo8.estudiante.persistence.entity.EstudianteEntity;
import co.edu.uniandes.csw.preGrupo8.seccion.persistence.entity.SeccionEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn; 
import org.eclipse.persistence.annotations.JoinFetch;

@Entity
@IdClass(Seccioninscritos_seccionEntityId.class)
@NamedQueries({
    @NamedQuery(name = "Seccioninscritos_seccionEntity.getByMasterId", query = "SELECT  u FROM Seccioninscritos_seccionEntity u WHERE u.seccionId=:seccionId"),
    @NamedQuery(name = "Seccioninscritos_seccionEntity.deleteSeccioninscritos_seccionEntity", query = "DELETE FROM Seccioninscritos_seccionEntity u WHERE u.seccionId=:seccionId and  u.inscritos_seccionId=:inscritos_seccionId")
})
public class Seccioninscritos_seccionEntity implements Serializable {

    @Id
    @Column(name = "seccionId")
    private Long seccionId;
    @Id
    @Column(name = "inscritos_seccionId")
    private Long inscritos_seccionId;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "seccionId", referencedColumnName = "id")
    @JoinFetch
    private EstudianteEntity seccionIdEntity;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "inscritos_seccionId", referencedColumnName = "id")
    @JoinFetch
    private EstudianteEntity inscritos_seccionIdEntity; 

    public Seccioninscritos_seccionEntity() {
    }

    public Seccioninscritos_seccionEntity(Long seccionId, Long inscritos_seccionId) {
        this.seccionId =seccionId;
        this.inscritos_seccionId = inscritos_seccionId;
    }

    public Long getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(Long seccionId) {
        this.seccionId = seccionId;
    }

    public Long getInscritos_seccionId() {
        return inscritos_seccionId;
    }

    public void setInscritos_seccionId(Long inscritos_seccionId) {
        this.inscritos_seccionId = inscritos_seccionId;
    }

    public EstudianteEntity getSeccionIdEntity() {
        return seccionIdEntity;
    }

    public void setSeccionIdEntity(EstudianteEntity seccionIdEntity) {
        this.seccionIdEntity = seccionIdEntity;
    }

    public EstudianteEntity getInscritos_seccionIdEntity() {
        return inscritos_seccionIdEntity;
    }

    public void setInscritos_seccionIdEntity(EstudianteEntity inscritos_seccionIdEntity) {
        this.inscritos_seccionIdEntity = inscritos_seccionIdEntity;
    }

}
