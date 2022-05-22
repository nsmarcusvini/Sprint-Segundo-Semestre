var usuarioModel = require("../models/usuarioModel");

var sessoes = [];

function testar (req, res) {
    console.log("ENTRAMOS NA usuarioController");
    res.json("ESTAMOS FUNCIONANDO!");
}

function listarTecnicos(req, res) {
    let fkHospital = req.params.fkHospital;

    usuarioModel.listarTecnicos(fkHospital)
    .then(function(resultado) {
        if (resultado.length > 0) {
            res.status(200).json(resultado);
        }
    }).catch(
        function(error) {
            console.log(error);
            res.status(500).json(error.sqlMessage);
        }
    )
}

function listar(req, res) {
    usuarioModel.listar()
    .then(function (resultado) {
        if (resultado.length > 0) {
            res.status(200).json(resultado);
        } else {
            res.status(204).send("Nenhum resultado encontrado!")
        }
    }).catch(
        function (erro) {
            console.log(erro);
            console.log("Houve um erro ao realizar a consulta! Erro: ", erro.sqlMessage);
            res.status(500).json(erro.sqlMessage);
        }
    );
}

function entrar (req, res) {
    var email = req.body.loginEmail;
    var senha = req.body.loginPassword;

    let checkboxTecnico = req.body.checkbox;
    
    if (email == undefined) {
        res.status(400).send("Seu email está undefined!");
    } else if (senha == undefined) {
        res.status(400).send("Sua senha está indefinida!");
    } else {
        usuarioModel.entrar(email, senha, checkboxTecnico)
        .then(
            function (resultado) {
                console.log(checkboxTecnico);
                console.log(`\nResultados encontrados: ${resultado.length}`);
                console.log(`Resultados: ${JSON.stringify(resultado)}`); // transforma JSON em String

                if (resultado.length == 1) {
                    console.log(resultado);
                    res.json(resultado[0]);
                } else if (resultado.length == 0) {
                    res.status(403).send("Email e/ou senha inválido(s)");
                } else {
                    res.status(403).send("Mais de um usuário com o mesmo login e senha!");
                }
            }
        ).catch(
            function (erro) {
                console.log(erro);
                console.log("\nHouve um erro ao realizar o login! Erro: ", erro.sqlMessage);
                res.status(500).json(erro.sqlMessage);
            }
        );
    }
}

function validarCadastro(req, res) {
    let corporateName = req.body.corporateName;
    let cnpj = req.body.cnpj;
    let email = req.body.email;
    let phoneNumber = req.body.phoneNumber;
    let cep = req.body.cep;
    let publicPlace = req.body.publicPlace;
    let state = req.body.state;
    let city = req.body.city;
    let password = req.body.password;

    if (corporateName == undefined) {
        res.status(400).send("Seu nome está undefined!");
    } else if (cnpj == undefined) {
        res.status(400).send("Seu email está undefined!");
    } else if (email == undefined) {
        res.status(400).send("Sua senha está undefined!");
    } else if (phoneNumber == undefined) {
        res.status(400).send("Sua telefone está undefined!"); 
    } else if (cep == undefined) {
        res.status(400).send("Sua cnpj está undefined!"); 
    } else if (publicPlace == undefined) {
        res.status(400).send("Sua cep está undefined!"); 
    } else if (state == undefined) {
        res.status(400).send("Sua logradouro está undefined!"); 
    } else if (city == undefined) {
        res.status(400).send("Sua cidade está undefined!"); 
    } else if (password == undefined) {
        res.status(400).send("Sua bairro está undefined!"); 
    } else {
        usuarioModel.validarCadastro(email)
        .then(
            function (resultado) {
                console.log(`ESTOU NA FUNCAO, O TAMANHO DO RESULTADO É ${resultado.length}`);

                if (resultado.length == 0) {
                    cadastrar(req, res);
                } else {
                    res.status(409).send("E-mail já cadastrado!")
                }
            }
        ).catch(
            function (error) {
                console.log(error);
                res.status(500).send(error.sqlMessage);
                res.status(500).send(error);
            }
        )
    }
}

function validarCadastroTecnico(req, res) {
    let email = req.body.email;

    if (email == undefined) {
        res.status(400).send("Sua senha está undefined!");
    } else {
        usuarioModel.validarCadastroTecnico(email)
        .then(
            function(resultado) {
                if (resultado.length == 0) {
                    cadastrarTecnico(req, res);
                } else {
                    res.status(409).send("E-mail já cadastrado!");
                }
            }
        ).catch(
            function (error) {
                console.log(error);
                res.status(500).send(error.sqlMessage);
                res.status(500).send(error);
            }
        )
    }
}

function cadastrar(req, res) {
    let corporateName = req.body.corporateName;
    let cnpj = req.body.cnpj;
    let email = req.body.email;
    let phoneNumber = req.body.phoneNumber;
    let cep = req.body.cep;
    let publicPlace = req.body.publicPlace;
    let state = req.body.state;
    let city = req.body.city;
    let password = req.body.password;

    usuarioModel.cadastrar(corporateName, cnpj, email, phoneNumber, cep, publicPlace, state, city, password)
        .then(
            function (resultado) {
                res.json(resultado);
            }
        ).catch(
            function (erro) {
                console.log(erro);
                console.log(
                    "\nHouve um erro ao realizar o cadastro! Erro: ",
                    erro.sqlMessage
                );
                res.status(500).json(erro.sqlMessage);
            }
        );
}

function cadastrarTecnico(req, res) {
    let name = req.body.name;
    let cpf = req.body.cpf;
    let phoneNumber = req.body.phone;
    let email = req.body.email;
    let password = req.body.password;
    let fkHospital = req.params.fkHospital;

    if (name == undefined) {
        res.status(400).send("Seu nome está undefined!");
    } else if (cpf == undefined) {
        res.status(400).send("Seu cpf está undefined!");
    } else if (phoneNumber == undefined) {
        res.status(400).send("Seu telefone está undefined!"); 
    } else if (email == undefined) {
        res.status(400).send("Seu email está undefined!"); 
    } else if (password == undefined) {
        res.status(400).send("Sua senha está undefined!"); 
    } else {
        usuarioModel.cadastrarTecnico(name, email, fkHospital, cpf, phoneNumber, password)
        .then(
            function (resultado) {
                res.json(resultado);
            }
        ).catch(
            function (erro) {
                console.log(erro);
                console.log(
                    "\nHouve um erro ao realizar o cadastro! Erro: ",
                    erro.sqlMessage
                );
                res.status(500).json(erro.sqlMessage);
            }
        );
    }
}

function deletarTecnico(req, res) {
    let id = req.params.idTecnico;

    usuarioModel.deletarTecnico(id)
        .then(
            function(resultado) {
                res.json(resultado);
            }
        ).catch(
            function(erro) {
                console.log(erro);
                console.log(erro.sqlMessage);
            }
        )
}

function atualizarTecnico(req, res) {
    let id = req.params.idTecnico;
    let field = req.body.fieldSelect;
    let value = req.body.newValue;

    if(id == undefined) {
        res.status(400).send("O nome está undefined!");
    } else if (field == undefined) {
        res.status(400).send("O campo está undefined!");
    } else if (value == undefined) {
        res.status(400).send("O valor está undefined!");
    } else {
        usuarioModel.atualizarTecnico(id, field, value)
            .then(
                function(resultado) {
                    res.json(resultado);
                }
            ).catch(
                function(error) {
                    console.log(error);
                    console.log(error.sqlMessage);
                }
            )
    }
}

function listarAcessos(req, res) {
    usuarioModel.listarAcessos()
        .then(function (resultado) {
            if (resultado.length > 0) {
                res.status(200).json(resultado);
            } else {
                res.status(204).send("Nenhum resultado encontrado!")
            }
        }).catch(
            function (erro) {
                console.log(erro);
                console.log("Houve um erro ao realizar a consulta! Erro: ", erro.sqlMessage);
                res.status(500).json(erro.sqlMessage);
            }
        );
}

module.exports = {
    entrar,
    validarCadastro,
    validarCadastroTecnico,
    cadastrar,
    cadastrarTecnico,
    deletarTecnico,
    atualizarTecnico,
    listar,   
    listarTecnicos,
    testar,
    listarAcessos
}