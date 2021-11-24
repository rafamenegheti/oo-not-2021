let handleClienteSubmit = () => {
  // recuperar os dados do usuário e já cria o objeto
  // vamos utilizar programação DOM (document object model)

  let paciente
  let verbo
  let id = document.getElementById("id").value
  if (id) {
    paciente = {
      id: document.getElementById("id").value,
      nome: document.getElementById("nome").value,
      cpf: document.getElementById("cpf").value,
      altura: Number(document.getElementById("altura").value),
      peso: Number(document.getElementById("peso").value),
      idade: Number(document.getElementById("idade").value)
    }
    verbo = 'PUT'
  } else {
    paciente = {
      nome: document.getElementById("nome").value,
      cpf: document.getElementById("cpf").value,
      altura: Number(document.getElementById("altura").value),
      peso: Number(document.getElementById("peso").value),
      idade: Number(document.getElementById("idade").value)
    }
    verbo = 'POST'
  }


  if ((!paciente.nome) || (!paciente.cpf) || (!paciente.altura)) {
    alert(`Campos vazios`)
    return
}

  // vamos criar a conexão
  let requisicao = new XMLHttpRequest()
  // true indica que a abertura de conexão é assíncrona
  requisicao.open(verbo, 'http://localhost:8080/paciente', true)

  // configura o cabeçalho da requisição
  requisicao.setRequestHeader("Content-Type", "application/json")
  // converte json em string
  requisicao.send(JSON.stringify(paciente))
  alert('Paciente foi inserido com sucesso')
  fillTable()

}

let handleMedicoSubmit = () => {
  // recuperar os dados do usuário e já cria o objeto
  // vamos utilizar programação DOM (document object model)

  let medico
  let verbo
  let endpoint 
  let mensagem
  let id = document.getElementById("idMedico").value
  if (id) {
    medico = {
      id: document.getElementById("idMedico").value,
      nome: document.getElementById("nomeMedico").value,
      crm: document.getElementById("crm").value,
      especialidade: document.getElementById("especialidade").value,
    }
    console.log(JSON.stringify(medico))
    endpoint ='http://localhost:8080/medico/'
    verbo = 'PUT'
    mensagem= 'Medico alterado'
  } else {
    medico = {
      nome: document.getElementById("nomeMedico").value,
      crm: document.getElementById("crm").value,
      especialidade: document.getElementById("especialidade").value,
    }
    endpoint ='http://localhost:8080/medico/'
    verbo = 'POST'
    mensagem= 'Medico inserido'
  }


  if ((!medico.nome) || (!medico.crm) || (!medico.especialidade)) {
    alert(`Campos vazios`)
    return
}

  // vamos criar a conexão
  let requisicao = new XMLHttpRequest()
  // true indica que a abertura de conexão é assíncrona
  requisicao.open(verbo, endpoint, true)

  // configura o cabeçalho da requisição
  requisicao.setRequestHeader("Content-Type", "application/json")
  // converte json em string
  requisicao.send(JSON.stringify(medico))
  alert(mensagem)
  fillTableMedico()

}


const fillTable = () => {
  //criar conexão para chamada de API
  let req = new XMLHttpRequest()
  req.open('GET', 'http://localhost:8080/paciente', true)
  req.onload = function () {
    //recupeando os dados do servidor(a partir da API)
    pacientes = JSON.parse(this.response)
    //percorrer os pacientes
    let conteudo = ""
    pacientes.map(paciente => {
      conteudo = conteudo + `<tr> <td> ${paciente.nome}</td> <td> ${paciente.cpf}</td> <td> ${paciente.altura}</td> <td> ${paciente.peso}</td> <td> ${paciente.idade} </td> <td> <button onClick="handleDelete(${paciente.id})"> <i class="bi bi-archive-fill"></i> </button> </td> <td> <button onClick="handleEdit(${paciente.id}, '${paciente.cpf}', '${paciente.nome}', ${paciente.altura}, ${paciente.idade}, ${paciente.peso})"> <i class="bi bi-pencil-fill"></i> </button> </td> </tr>`
  })
    //monta a saída de dado
    document.getElementById("conteudoTabela").innerHTML = conteudo
  }
  req.send()
}

const fillTableMedico = () => {
  console.log('oi')
  //criar conexão para chamada de API
  let req = new XMLHttpRequest()
  req.open('GET', 'http://localhost:8080/medico', true)
  req.onload = function () {
    //recupeando os dados do servidor(a partir da API)
    medicos = JSON.parse(this.response)
    //percorrer os pacientes
    let conteudo = ""
    medicos.map(medicos => {
      conteudo = conteudo + `<tr> <td> ${medicos.nome}</td> <td> ${medicos.crm}</td> <td> ${medicos.especialidade}</td> <td> <button onClick="handleDeleteMedico(${medicos.id})"> <i class="bi bi-archive-fill"></i> </button> </td> <td> <button onClick="handleEditMedico(${medicos.id}, '${medicos.nome}', '${medicos.crm}', '${medicos.especialidade}')"> <i class="bi bi-pencil-fill"></i> </button> </td> </tr>`
  })
    //monta a saída de dado
    document.getElementById("conteudoTabelaMedico").innerHTML = conteudo
  }
  req.send()
}


const handleDelete = (id) => {
  let resp = confirm('Deseja excluir o paciente?')
  if (resp) {
    let req = new XMLHttpRequest()
    req.open('DELETE', `http://localhost:8080/paciente/${id}`, true)
    req.send()
    alert('Paciente removido com sucesso')
    fillTable()
  }
}

const handleDeleteMedico = (id) => {
  let resp = confirm('Deseja excluir o medico?')
  if (resp) {
    let req = new XMLHttpRequest()
    req.open('DELETE', `http://localhost:8080/medico/${id}`, true)
    req.send()
    alert('Medico removido com sucesso')
    fillTableMedico()
  }
}


const handleEditMedico = (id, nome, crm, especialidade) => {
  alert('pika')
  document.getElementById("nomeMedico").value = nome
  document.getElementById("crm").value = crm
  document.getElementById("especialidade").value = especialidade
  //jogada de mestre
  document.getElementById("idMedico").value = id
}

