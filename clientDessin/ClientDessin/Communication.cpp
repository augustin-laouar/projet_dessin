#pragma warning(disable:4996) 
#pragma comment(lib, "ws2_32.lib") // sp�cifique � VISUAL C++
#include "Communication.h"
Communication::Communication(const char* adresse, short port) {
	WSADATA wsaData;        // structure contenant les donn�es de la librairie winsock � initialiser

	connexion = WSAStartup(MAKEWORD(2, 0), &wsaData);       // MAKEWORD(2,0) sert � indiquer la version de la librairie � utiliser : 1 pour winsock et 2 pour winsock2

	/* en cas de succ�s, wsaData a �t� initialis�e et l'appel a renvoy� la valeur 0 */

	if (connexion) throw Erreur("L'initialisation a �chou�");

	cout << "client vers le serveur de majuscule" << endl;
	cout << "initialisation effectu�e" << endl;

	//---------------------- cr�ation socket -------------------------------------------------


	int familleAdresses = AF_INET;         // IPv4
	int typeSocket = SOCK_STREAM;           // mode connect� TCP
	int protocole = IPPROTO_TCP;            // protocole. On peut aussi mettre 0 et la fct choisit le protocole en fct des 2 1ers param�tres
	// pour les valeurs des param�tres : cf. fct socket dans la doc sur winsock

	this->sock = socket(familleAdresses, typeSocket, protocole);

	if (sock == INVALID_SOCKET)
	{
		ostringstream oss;
		oss << "la cr�ation du socket a �chou� : code d'erreur = " << WSAGetLastError() << endl;    // pour les valeurs renvoy�es par WSAGetLastError() : cf. doc r�f winsock
		throw Erreur(oss.str().c_str());
	}
	//------------------------------ cr�ation du repr�sentant du serveur ----------------------------------------

	sockaddr.sin_family = AF_INET;
	sockaddr.sin_addr.s_addr = inet_addr(adresse);   // inet_addr() convertit de l'ASCII en entier
	//InetPton(adresseServeur, sockaddr.sin_addr.s_addr);
	sockaddr.sin_port = htons(port);                 //htons() assure que le port est bien inscrit dans le format du r�seau (little-endian ou big-endian)

	//-------------- connexion du client au serveur ---------------------------------------

	this->connexion = connect(sock, (SOCKADDR*)&sockaddr, sizeof(sockaddr));     // renvoie une valeur non nulle en cas d'�chec.
	// Le code d'erreur peut �tre obtenu par un appel � WSAGetLastError()

	if (connexion == SOCKET_ERROR)
		throw Erreur("La connexion a �chou�");

}